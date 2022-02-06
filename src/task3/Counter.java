package task3;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Counter {
    // вспомогательная функция, возращает количество гласных в слове с помощью регулярного выражения
    public static int countVowels(String word) {
        int count = 0;
        // привожу к нижнему регистру, чтобы не писать слишком большое регулярное выражение
        String lower = word.toLowerCase(Locale.ROOT);
        Pattern pattern = Pattern.compile("[ауоыэюяеёи]");
        Matcher matcher = pattern.matcher(lower);
        while (matcher.find()) {
            count++;
        }
        return count;
    }


    // метод, который выводит слова в порядке убывания количества гласных
    public void sortedPrint(String str) {
        // записываем все слова из строки в словарь, там
        String[] words = str.split(" ");
        Map<String, Integer> unsortedWords = new HashMap<String, Integer>();
        for (String word : words) {
            unsortedWords.put(word, countVowels(word));
        }
        // сортируем словарь по значению (я нашел это выражение в интернете, не бейте))0)
        Map<String, Integer> sortedWords = unsortedWords.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));
        // вывод коллекции с помощью лямбда выражения
        sortedWords.forEach((key, value) -> System.out.printf("%s : %s\n", key, value));
    }

    // метод, который приводит первую гласную букву к верхнему регистру
    public String toUpper(String word) {
        Pattern pattern = Pattern.compile("[АУОЫЭЮЯЕЁИ]|[ауоыэюяеёи]");
        Matcher matcher = pattern.matcher(word);
        try {
            matcher.find();
            int index = matcher.start();
            return word.substring(0, index) + word.substring(index, index + 1).toUpperCase() + word.substring(index + 1, word.length());
        } catch (IllegalStateException e) {
            return word;
        }
    }
}
