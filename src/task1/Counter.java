package task1;

public class Counter {
    private String str;
    private int sum;

    public Counter(String input) {
        str = input;
        sum = 0;
    }

    public int getSum() {
        return sum;
    }

    // идея решения: разбиваем строку на массив слов и пытаемся привести каждое к целочисленному типу
    // если приведение невозможно, пропускаем это слово
    public void countSum() {
        String[] words = str.split(" ");
        for (String word : words) {
            try {
                sum += Integer.parseInt(word);
            } catch (NumberFormatException e) {
            }
        }
    }
}
