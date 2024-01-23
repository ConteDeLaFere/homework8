import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task();
    }

    public static void task() {
        //Задача 1
        final int size1 = 3;
        Integer[] intArr = new Integer[size1];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i + 1;
        }

        Double[] doubleArr = {1.57, 7.654, 9.986};

        final int size2 = 10;
        Character[] charArr = new Character[size2];
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = (char) ('A' + i);
        }

        //Задача 2 (использую метод printArray для вывода массива в консоль)
        printArray(intArr);
        printArray(doubleArr);
        printArray(charArr);

        //Задача 3 (использую метод printReverseArray для вывода массива в консоль в обратном порядке)
        printReverseArray(intArr);
        printReverseArray(doubleArr);
        printReverseArray(charArr);

        //Задача 4 (использую метод toEvenArray для приведения элементов целочисленного массива к четным числам)
        toEvenArray(intArr);
        System.out.println(Arrays.toString(intArr));
    }

    public static <T> void printArray(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static <T> void printReverseArray(T[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void toEvenArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) % 2 == 1) {
                arr[i]++;
            }
        }
    }
}