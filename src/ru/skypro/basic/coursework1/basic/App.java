package ru.skypro.basic.coursework1.basic;

public class App {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван0 Иванович", 1, 20_000);
        employees[1] = new Employee("Иванов Иван1 Иванович", 2, 30_000);
        employees[2] = new Employee("Иванов Иван2 Иванович", 3, 40_000);
        employees[3] = new Employee("Иванов Иван3 Иванович", 4, 50_000);
        employees[4] = new Employee("Иванов Иван4 Иванович", 5, 60_000);
        printAll();
        printSumSalary();
        printMinSalary();
        printMaxSalary();
        printAverageSalary();
        printAllNames();
    }

    public static void printAll() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static int sumSalary() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumSalary += employee.getSalary();
            }
        }
        return sumSalary;
    }

    public static void printSumSalary() {
        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalary() + " рублей");
    }

    public static Employee findMinSalary() {
        int minSalary = employees[0].getSalary();
        int temp = 0;
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                temp = i;
            }
        }
        return employees[temp];
    }

    public static void printMinSalary() {
        System.out.println("Сотрудник с минимальной зарплатой:\n" + findMinSalary());
    }

    public static Employee findMaxSalary() {
        int maxSalary = employees[0].getSalary();
        int temp = 0;
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                temp = i;
            }
        }
        return employees[temp];
    }

    public static void printMaxSalary() {
        System.out.println("Сотрудник с максимальной зарплатой:\n" + findMaxSalary());
    }

    public static double countAverageSalary() {
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                counter++;
            }
        }
        return (double) sumSalary() / counter;
    }

    public static void printAverageSalary() {
        System.out.println("Среднее значение зарплат: " + countAverageSalary() + " рублей");
    }

    public static void printAllNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}
