package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int number = in.nextInt();
            Divider divider = new Divider(number);
            divider.printDividers();
        } catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение");
        }
    }

}
