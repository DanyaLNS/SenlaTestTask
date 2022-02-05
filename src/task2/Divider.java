package task2;

public class Divider {
    private int number;

    // служебная функция для проверки, является ли делитель простым числом
    public static boolean isSimple(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public Divider(int number) {
        this.number = number;
    }

    // основной метод: проходим по всем числам от 2 до введенного значения, ищем среди них простые делители
    // делим на них пока делится, потом переходим к следующему значению и так до тех пор, пока исходное число !=1
    public void printDividers() {
        for (int i = 2; i <= number; i++) {
            if (isSimple(i)) {
                while (number % i == 0) {
                    System.out.print(i + " ");
                    number = number / i;
                }
                // проверка для досрочного выхода из цикла
                if (number == 1) {
                    return;
                }
            }
        }
    }
}
