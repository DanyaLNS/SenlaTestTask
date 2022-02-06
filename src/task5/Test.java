package task5;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Safe safe = new Safe(20);
        Thing thing1 = new Thing(10, 3);
        Thing thing2 = new Thing(2, 1);
        Thing thing3 = new Thing(100, 10);
        Thing thing4 = new Thing(10, 20);

        ArrayList<Thing> things = new ArrayList<>();
        things.add(thing1);
        things.add(thing2);
        things.add(thing3);
        things.add(thing4);

        safe.fill(things);
    }
}
