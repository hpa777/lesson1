package geekbrains.lesson_1.hello_world;

public class Main {

    public static void main(String[] args) {

        //Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte p1 = 127;
        short p2 = 13000;
        long p3 = 42353453245L;
        double p4 = 435344.44;
        char p9 = 'q';
        boolean p10 = true;

        //Проверка задания 3
        float p5 = 6.3f;
        float p6 = 3.1f;
        float p7 = 4.7f;
        float p8 = 5.2f;
        System.out.println(calculate(p5,p6,p7,p8));

        //Проверка задания 4
        System.out.println(isBetween(10, 1) ? "В пределах" : "Не в пределах");

        //Проверка задания 5
        printNumberSign(0);

        //Проверка задания 6
        System.out.println(isNegativeNumber(-5) ? "Отрицательное число" : "Положительное число");

        //Проверка задания 7
        hello("Павел");

        //Проверка задания 8
        for (int i = 1900; i<=2020; i++) {
            isLeapYear(i);
        }
    }

    /**
     * @param a <code>float</code>
     * @param b <code>float</code>
     * @param c <code>float</code>
     * @param d <code>float</code>
     * @return <code>float</code> a * (b + (c / d))
     */
    public static float calculate (float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    /**
     * Проверяет, что сумма параметров лежит в пределах от 10 (включительно) до 20 (включительно)
     * @param a <code>int</code>
     * @param b <code>int</code>
     * @return <code>boolean</code>
     */
    public static boolean isBetween (int a, int b) {
        int sum = a + b;
        return 10 <= sum && sum <= 20;
    }

    /**
     * Печатает в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     * @param a <code>int</code>
     */
    public static void printNumberSign (int a) {
        String message = a < 0 ? "Отрицательное число" : "Положительное число";
        System.out.println(message);
    }

    /**
     * Возвращает true, если число отрицательное, и вернуть false если положительное.
     * @param a <code>int</code>
     * @return <code>boolean</code>
     */
    public static boolean isNegativeNumber (int a) {
        return a < 0;
    }

    /**
     * Выводит приветствие
     * @param name <code>String</code>
     */
    public static void hello (String name) {
        System.out.printf("Привет, %s!%n", name);
    }

    /**
     * Определяет, является ли год високосным, и выводит сообщение в консоль.
     * @param year <code>int</code>
     */
    public static void isLeapYear(int year) {
        String message = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? "високосный" : "невисокосный";
        System.out.printf("%d год - %s%n", year, message);
    }
}
