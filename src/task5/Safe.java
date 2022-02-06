package task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Safe {
    private int volume;
    // список с наиболее ценными объектами
    private ArrayList<Thing> things;
    private int price;

    public Safe(int volume) {
        this.volume = volume;
        things = new ArrayList<>();
        price = 0;
    }

    public void fill(ArrayList<Thing> allThings) {
        Thing[] sortedThings = new Thing[allThings.size()];
        for (int i = 0; i < sortedThings.length; i++) {
            sortedThings[i] = allThings.get(i);
        }
        // получаем массив объектов, отсортированных по их ценности
        Arrays.sort(sortedThings, Comparator.comparing(Thing::getWorth));

        for (int i = sortedThings.length - 1; i >= 0; i--) {
            // если самый ценный объект помещается, засовываем его в сейф
            if (volume - sortedThings[i].getVolume() > 0) {
                things.add(sortedThings[i]);
                volume-=sortedThings[i].getVolume();
                price+=sortedThings[i].getValue();
            }
        }
        System.out.println("Стоимость предметов в сейфе = " + price);
    }
}