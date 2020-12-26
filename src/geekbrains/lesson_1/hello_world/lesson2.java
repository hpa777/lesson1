package geekbrains.lesson_1.hello_world;

public class lesson2 {
    /**
     * Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void reversArrayItems() {
        int arr[] = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    /**
     * Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    public static void fillArray() {
        int arr[] = new int[8];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = count;
            count +=3;
            System.out.print(arr[i]+ ",");
        }
        System.out.println();
    }

    /**
     * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static void timesArrayItems() {
        int arr[] = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i]+ ",");
        }
        System.out.println();
    }

    /**
     * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    public static void fillDiagonalArray() {
        int arrayLength = 7;
        int arr[][] = new int[arrayLength][arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arr[i][i] = 1;
            arr[arrayLength - i - 1][i] = 1;
        }
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
     */
    public static void findExtremum() {
        int arr[] = new int[]{1, 24, -3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] < min) {
                min = arr[i];
            }
            if (i == 0 || arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("min value - " + min);
        System.out.println("max value - " + max);
    }

    /**
     *  Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
     *  если в массиве есть место, в котором сумма левой и правой части массива равны.
     * @param array
     * @return <code>boolean</code>
     */
    public static boolean checkBalance(int[] array) {
        boolean result = false;
        if (array.length > 1) {
            int sumLeft = 0;
            for (int i = 0; i < array.length - 1; i++) {
                sumLeft += array[i];
                int sumRight = 0;
                for (int j = i + 1; j < array.length; j++) {
                    sumRight+=array[j];
                }
                if (sumRight == sumLeft) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
     * при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
     * @param array
     * @param offset
     * @return <code>array</code>
     */
    public static int[] offsetArray(int[] array, int offset) {
        if (Math.abs(offset) > array.length) {
            offset %= array.length;
        }
        boolean isEvenParams = array.length % 2 == 0 && offset % 2 == 0;
        int index = 0;
        int currentValue = array[index];
        for (int i = 0; i < array.length; i++) {
            int replacementIndex = index + offset;
            if (Math.abs(replacementIndex) >= array.length) {
                replacementIndex %= array.length;
            }
            if (replacementIndex < 0) {
                replacementIndex = array.length + replacementIndex;
            }
            int replacementValue = array[replacementIndex];
            array[replacementIndex] = currentValue;
            currentValue = replacementValue;
            index = replacementIndex;
            if (isEvenParams && index < Math.abs(offset) && index < array.length - 1) {
                index++;
                currentValue = array[index];
            }
        }
        return array;
    }

}
