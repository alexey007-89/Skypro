package ru.skypro.homework5;

import java.util.Arrays;

public class hw5 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int max = -1;
        int min = 200_001;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min +
                " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double average = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    private static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    private static void task5() {
        int[][] table = new int[3][3];
        for (int i = 0; i < table.length; i++) {
            for (int k = 0; k < table[0].length; k++) {
                if (i == k || (i + k) == table.length - 1) {
                    table[i][k] = 1;
                }
            }
        }
        for (int[] row : table) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    private static void task6() {
        int[] arr1 = {5, 4, 3, 2, 1};
        int[] arr2 = new int[arr1.length];
        int j = 0;
        for (int i = arr1.length - 1; i >= 0; i--) {
            arr2[j++] = arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    private static void task7() {
        int[] arr1 = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(arr1));
        int j = arr1.length - 1;
        for (int i = 0; i < arr1.length / 2; i++) {
            int temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j--] = temp;
        }
        System.out.println(Arrays.toString(arr1));
    }

    private static void task8() {
        //найти 2 элемента массива сумма которых равна заданному числу
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int sum = -2;
        Arrays.sort(arr);
        for (int j : arr) {
            int pair = sum - j;
            int index = Arrays.binarySearch(arr, pair);
            if (index > -1) {
                System.out.println(j + " " + arr[index]);
                break;
            }
        }
    }

    private static void task9() {
        //найти 2 элемента массива сумма которых равна заданному числу
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int pair = -2 - arr[i];
            int index = Arrays.binarySearch(arr, pair);
            if (index > -1) {
                System.out.println(arr[i] + " " + arr[index]);
            }
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
