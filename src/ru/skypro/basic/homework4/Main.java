package ru.skypro.basic.homework4;

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
        for (int i = 1; i < 32; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
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
            System.out.print(i + ": ");
            if (i % 3 == 0) {
                System.out.print("ping ");
            }
            if (i % 5 == 0) {
                System.out.print("pong");
            }
            System.out.print("\n");
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