package ru.skypro.basic.homework3;

public class hw3 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        byte clientOS = 1; // 0 - iOS; 1 - Android;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else System.out.println("Установите версию приложения для iOS по ссылке");
    }

    public static void task2() {
        byte clientOS = 1; // 0 - iOS; 1 - Android;
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015) {
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    }

    public static void task3() {
        int year = 1601;
        if (year % 4 != 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else System.out.println(year + " год является високосным");
    }

    public static void task4() {
        int distance = 95;
        int deliveryTime = 2;
        if (distance > 20 && distance <= 60) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (distance <= 20) {
            System.out.println("Потребуется дней: " + --deliveryTime);
        } else System.out.println("Потребуется дней: " + ++deliveryTime);
    }

    public static void task5() {
        byte monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            default:
                System.out.println("Месяцев в году не может быть больше 12ти");
                break;
        }
    }

    public static void task6() {
        int age = 19;
        int salary = 58_000;
        double creditLimit;
        if (age >= 23) {
            creditLimit = salary * 3.0;
        } else creditLimit = salary * 2.0;
        if (salary >= 50_000 && salary < 80_000) {
            creditLimit *= 1.2;
        } else if (salary >= 80_000) {
            creditLimit *= 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditLimit + " рублей");
    }

    public static void task7() {
        int age = 25;
        int salary = 60_000;
        int wantedSum = 330_000;
        double creditPercent = 10.0;
        int monthsOfCredit = 12;
        double monthlyPay;
        double maxMonthlyPay = salary / 2;
        if (age < 23) {
            creditPercent += 1.0;
        } else if (age < 30) {
            creditPercent += 0.5;
        }
        if (salary > 80_000.0) {
            creditPercent -= 0.7;
        }
        double monthCreditPercent = creditPercent / 100 / 12;
        monthlyPay = wantedSum * (monthCreditPercent / (1 - Math.pow(1 + monthCreditPercent, -monthsOfCredit)));
        String shortMonthlyPay = String.format("%.2f", monthlyPay);
        if (monthlyPay <= maxMonthlyPay) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPay +
                    " рублей. Платеж по кредиту " + shortMonthlyPay + " рублей. Одобрено.");
        } else System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPay +
                " рублей. Платеж по кредиту " + shortMonthlyPay + " рублей. Отказано.");
    }
}
