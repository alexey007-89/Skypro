package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(" " + number);
        }
        System.out.println();
        for (; number > 0; number--) {
            System.out.print(" " + number);
        }
    }

    public static void task2() {
        int day = 1;
        while (day < 32) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            day = day + 7;
        }
    }

    public static void task3() {
        int year = 2021;
        int startYear = year - 200;
        int endYear = year + 100;
        for (int i = 1896; i >= startYear && i <= endYear; i = i + 79) {
            System.out.println(i);
        }
    }

    public static void task4() {
        for (int i = 1; i < 31; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
                continue;
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
                continue;
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
                continue;
            }
            System.out.println(i + ":");
        }
    }

    public static void task5() {
        int first = 0;
        int second = 1;
        int next;
        System.out.print(first + " " + second + " ");
        for (int i = 0; i < 8; i++) {
            next = second + first;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
