package GB_lesson2;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        int[] arr6 = {2, 2, 2, 1, 2, 2, 10, 1};
        int[] arr7 = {1, 2, 3, 4};
        int n = 3;
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        MinMax();
        checkBalance(arr6);
        moveArray(arr7, n);
    }

    public static void invertArray() {
        int[] arr1 = {0, 1, 0, 1};
        System.out.println("Original array is " + Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
        }

        System.out.println("New array is " + Arrays.toString(arr1));
    }

    public static void fillArray() {
        int[] arr2 = new int[8];
        int c = 0;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = c;
            c += 3;
        }
        System.out.println("Fill array is " + Arrays.toString(arr2));
    }

    public static void changeArray() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println("New array is " + Arrays.toString(arr3));
    }

    public static void fillDiagonal() {
        int[][] arr4 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void MinMax() {
        int[] arr5 = {99, 5, 3, 2, 11, 4, 500, 2, 4, 8, 9, 1};
        int min = arr5[0];
        int max = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] < min) {
                min = arr5[i];
            }
            if (arr5[i] > max) {
                max = arr5[i];
            }
        }
        System.out.println("Min is " + (min) + " Max is " + (max));
    }

    public static boolean checkBalance(int[] array) {
        boolean b = false;
        for (int i = 0; i < array.length + 1; i++) {
            int sl = 0;
            int sr = 0;
            for (int j = 0; j < i; j++) {
                sl += array[j];

            }
            for (int j = i; j < array.length; j++) {
                sr += array[j];

            }
            if (sl == sr) {
                b = true;
                System.out.println("Array is balanced, return " + (b));
            }
        }
        return b;
    }

    public static void moveArray(int[] array, int n) {
        int c = 0;
        System.out.println("Array is " + Arrays.toString(array));
        System.out.println("New array is ");
        if (n > 0) {
            for (int i = 0; i < n; i++) {

                int buffer = array[0];
                array[0] = array[array.length - 1];

                for (int j = 1; j < array.length - 1; j++) {
                    array[array.length - j] = array[array.length - j - 1];
                }
                array[1] = buffer;

                for (int j = 0; j < array.length; j++) {
                    if (n == i + n) {
                        System.out.print(array[j] + " "); //печатаю только последнюю итерацию цикла,где элементы уже сдвинуты
                    }
                }


                System.out.println();
            }
        } else if (n < 0) {
            for (int i = 0; i > n; i--) {
                int buffer = array[array.length - 1];
                array[array.length - 1] = array[0];

                for (int j = 1; j < array.length - 1; j++) {
                    array[j - 1] = array[j];
                }

                array[array.length - 2] = buffer;
                if (n == i + n) {
                    for (int j = 0; j < array.length; j++) {
                        System.out.print(array[j] + " ");
                    }
                    System.out.println();
                }
            }

        }
    }

}










