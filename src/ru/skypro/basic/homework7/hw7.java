package ru.skypro.basic.homework7;

import java.time.LocalDate;
import java.util.Arrays;

import static ru.skypro.basic.homework5.hw5.generateRandomArray;

public class hw7 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();

    }

    public static void task1() {
        int year = 2020;
        checkLeapAndPrint(year);
    }

    public static void checkLeapAndPrint(int year) {
        System.out.print(year);
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(" — високосный год");
        } else {
            System.out.println(" — не високосный год");
        }
    }

    public static void task2() {
        int clientDeviceYear = 2020;
        int clientOS = 0; // 0 - iOS, 1 - Android
        printResultMessage(clientDeviceYear, clientOS);
    }

    public static void printResultMessage(int clientDeviceYear, int clientOS) {
        StringBuilder message = new StringBuilder("Установите ");
        if (isLight(clientDeviceYear)) {
            message.append("облегченную ");
        }
        message.append("версию приложения для ");
        if (clientOS == 0) {
            message.append("iOS ");
        } else message.append("Android ");
        message.append("по ссылке");
        System.out.println(message);
    }

    public static boolean isLight(int year) {
        int currentYear = LocalDate.now().getYear();
        if (year == currentYear) {
            return false;
        } else return true;
    }

    public static void task3() {
        int distance = 95;
        int deliveryTime = calculateDeliveryTime(distance);
        System.out.println("Потребуется дней: " + deliveryTime);
    }

    public static int calculateDeliveryTime(int distance) {
        int deliveryTime = 1;
        if (distance <= 60 && distance > 20) {
            deliveryTime++;
        } else if (distance > 60) {
            deliveryTime += 2;
        }
        return deliveryTime;
    }

    public static void task4() {
        String doubleLetter = "aabcdefghоjjk";
        checkDoubles(doubleLetter);

    }

    public static void checkDoubles(String doubleLetter) {
        char[] letters = doubleLetter.toCharArray();
        for (int i = 1; i < letters.length; i++) {
            if (letters[i] == letters[i - 1]) {
                System.out.println("Дублируемый символ " + letters[i]);
                return;
            }
        }
        System.out.println("Дублируемых символов нет");
    }

    public static void task5() {
        int[] arr = {3, 2, 1, 6, 5};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr) {
        int j = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j--] = temp;
        }
    }

    private static void task6() {
        int[] arr = generateRandomArray();
        calculateAverageFee(arr);
    }

    public static void calculateAverageFee(int[] arr) {
        int sum = calculateSum(arr);
        double averageFee = calculateAverage(sum, arr);
        printAnswer(averageFee);
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static double calculateAverage(int sum, int[] arr) {
        double average = (double) sum / arr.length;
        return average;
    }

    private static void printAnswer(double averageFee) {
        System.out.println("Средняя сумма трат за месяц составила " + averageFee + " рублей");
    }
}
