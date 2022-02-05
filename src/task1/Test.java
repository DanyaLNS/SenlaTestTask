package task1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.hasNextLine()) {
            String input = in.nextLine();
            Counter counter = new Counter(input);
            counter.countSum();
            System.out.println(counter.getSum());
        }
    }
}
