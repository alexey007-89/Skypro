package ru.skypro.coursework1.basic;

public class App {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван0 Иванович", 1, 20_000);
        employees[1] = new Employee("Иванов Иван1 Иванович", 2, 30_000);
        employees[2] = new Employee("Иванов Иван2 Иванович", 3, 40_000);
        employees[3] = new Employee("Иванов Иван3 Иванович", 4, 50_000);
        employees[4] = new Employee("Иванов Иван4 Иванович", 5, 60_000);
        printAll(employees);
        printSumSalary(employees);
        printMinSalary(employees);
        printMaxSalary(employees);
        printAverageSalary(employees);
        printAllNames(employees);
    }

    public static void printAll(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static int sumSalary(Employee[] employees) {
        int sumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumSalary += employee.getSalary();
            }
        }
        return sumSalary;
    }

    public static void printSumSalary(Employee[] employees) {
        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalary(employees) + " рублей");
    }

    public static Employee findMinSalary(Employee[] employees) {
        int minSalary = Integer.MAX_VALUE;
        int j = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                j = i;
            }
        }
        return employees[j];
    }

    public static void printMinSalary(Employee[] employees) {
        System.out.println("Сотрудник с минимальной зарплатой:\n" + findMinSalary(employees));
    }

    public static Employee findMaxSalary(Employee[] employees) {
        int maxSalary = Integer.MIN_VALUE;
        int j = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                j = i;
            }
        }
        return employees[j];
    }

    public static void printMaxSalary(Employee[] employees) {
        System.out.println("Сотрудник с максимальной зарплатой:\n" + findMaxSalary(employees));
    }

    public static double countAverageSalary(Employee[] employees) {
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                counter++;
            }
        }
        return (double) sumSalary(employees) / counter;
    }

    public static void printAverageSalary(Employee[] employees) {
        System.out.println("Среднее значение зарплат: " + countAverageSalary(employees) + " рублей");
    }

    public static void printAllNames(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}
