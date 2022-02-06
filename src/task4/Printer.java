package task4;

import java.util.*;

public class Printer {
    // Двумерные строковые массивы содержат в себе начертание каждой цифры
    private static String[][] num0 = {
            {"  **  "},
            {" *  * "},
            {"*    *"},
            {"*    *"},
            {"*    *"},
            {" *  * "},
            {"  **  "},
    };
    private static String[][] num1 = {
            {"   *  "},
            {"  **  "},
            {" * *  "},
            {"   *  "},
            {"   *  "},
            {"   *  "},
            {"  *** "},
    };
    private static String[][] num2   = {
            {"  **  "},
            {" *  * "},
            {" *  * "},
            {"    * "},
            {"   *  "},
            {"  *   "},
            {" **** "},
    };
    private static String[][] num3 = {
            {"  **  "},
            {" *  * "},
            {"    * "},
            {"   *  "},
            {"    * "},
            {" *  * "},
            {"  **  "},
    };
    private static String[][] num4 = {
            {"    * "},
            {"   ** "},
            {"  * * "},
            {"*   * "},
            {"* * **"},
            {"    * "},
            {"   ***"},
    };
    private static String[][] num5 = {
            {" **** "},
            {" *    "},
            {" **** "},
            {"     *"},
            {"     *"},
            {"     *"},
            {" **** "},
    };
    private static String[][] num6 = {
            {"  **  "},
            {" *  * "},
            {" *    "},
            {" ***  "},
            {" *  * "},
            {" *  * "},
            {"  **  "},
    };
    private static String[][] num7 = {
            {"******"},
            {"     *"},
            {"    * "},
            {"   *  "},
            {"  *   "},
            {" *    "},
            {"*     "},
    };
    private static String[][] num8 = {
            {"  **  "},
            {" *  * "},
            {" *  * "},
            {"  **  "},
            {" *  * "},
            {" *  * "},
            {"  **  "},
    };
    private static String[][] num9 = {
            {"  **  "},
            {" *  * "},
            {" *  * "},
            {"  *** "},
            {"    * "},
            {"    * "},
            {"  **  "},
    };
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        int numberLength = 0;
        // разбиваем число по цифрам и записываем их в список
        List<Integer> numberList = new ArrayList<>();
        while (number>0){
            numberList.add(number%10);
            number/=10;
            numberLength++;
        }
        // -1, чтобы не было выхода за границы массива в цикле ниже
        numberLength--;
        // внешний цикл отвечает за переход на новую строку
        for(int i = 0; i<7; i++){
            // внутренний цикл печатает фрагмент цифры числа
            // обратный порядок связан с тем, что число в списке записано задом наперед
            for(int j = numberLength; j>=0; j--){
                switch (numberList.get(j)){
                    case 0:
                        System.out.print(num0[i][0]);
                        break;
                    case 1:
                        System.out.print(num1[i][0]);
                        break;
                    case 2:
                        System.out.print(num2[i][0]);
                        break;
                    case 3:
                        System.out.print(num3[i][0]);
                        break;
                    case 4:
                        System.out.print(num4[i][0]);
                        break;
                    case 5:
                        System.out.print(num5[i][0]);
                        break;
                    case 6:
                        System.out.print(num6[i][0]);
                        break;
                    case 7:
                        System.out.print(num7[i][0]);
                        break;
                    case 8:
                        System.out.print(num8[i][0]);
                        break;
                    case 9:
                        System.out.print(num9[i][0]);
                        break;
                }
            }
            System.out.println();
        }
    }
}
