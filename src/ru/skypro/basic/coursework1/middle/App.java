package ru.skypro.basic.coursework1.middle;

public class App {
    private static final Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван0 Иванович", 1, 20_000);
        employees[1] = new Employee("Иванов Иван1 Иванович", 1, 30_000);
        employees[2] = new Employee("Иванов Иван2 Иванович", 2, 40_000);
        employees[3] = new Employee("Иванов Иван3 Иванович", 2, 50_000);
        employees[4] = new Employee("Иванов Иван4 Иванович", 2, 60_000);
        printAll();
        printDelimiter();
        increaseSalary(8);
        printAll();
        printDelimiter();
        printAll(2);
        printDelimiter();
        printSumSalary(2);
        printDelimiter();
        printMinSalary(2);
        printDelimiter();
        printMaxSalary(2);
        printDelimiter();
        printAverageSalary(1);
        printDelimiter();
        increaseSalary(10, 1);
        printAll(1);
        printDelimiter();
        printAll();
        printDelimiter();
        printEmployeesSalaryLess(40_000);
        printDelimiter();
        printEmployeesSalaryMore(40_000);
    }

    private static void printDelimiter() {
        System.out.println("*****************************");
        System.out.println("*****************************");
    }

    public static void printAll() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static void printAll(int departmentNumber) {
        boolean isNullDepartment = true;
        for (Employee employee : employees) {
            if (employee != null && departmentNumber == employee.getDepartmentNumber()) {
                System.out.println("т/н: " + employee.getId() + ", ФИО: " + employee.getFullName() +
                        ", з/п: " + employee.getSalary() + " рублей");
                isNullDepartment = false;
            }
        }
        if (isNullDepartment) {
            System.out.println("Введен неправильный номер отдела");
        }
    }

    public static int countSumSalary() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumSalary += employee.getSalary();
            }
        }
        return sumSalary;
    }

    public static int countSumSalary(int departmentNumber) {
        int sumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && departmentNumber == employee.getDepartmentNumber()) {
                sumSalary += employee.getSalary();
            }
        }
        return sumSalary;
    }

    public static void printSumSalary() {
        System.out.println("Сумма затрат на зарплаты в месяц: " + countSumSalary() + " рублей");
    }

    public static void printSumSalary(int departmentNumber) {
        System.out.println("Сумма затрат на зарплаты в месяц по отделу №:"
                + departmentNumber + " " + countSumSalary(departmentNumber) + " рублей");
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

    public static Employee findMinSalary(int departmentNumber) {
        int minSalary = employees[0].getSalary();
        int temp = 0;
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < minSalary
                    && employees[i].getDepartmentNumber() == departmentNumber) {
                minSalary = employees[i].getSalary();
                temp = i;
            }
        }
        return employees[temp];
    }

    public static void printMinSalary(int departmentNumber) {
        System.out.println("Сотрудник с минимальной зарплатой по отделу №:" +
                departmentNumber + " " + findMinSalary(departmentNumber).getFullName());
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

    public static Employee findMaxSalary(int departmentNumber) {
        int maxSalary = employees[0].getSalary();
        int temp = 0;
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalary
                    && employees[i].getDepartmentNumber() == departmentNumber) {
                maxSalary = employees[i].getSalary();
                temp = i;
            }
        }
        return employees[temp];
    }

    public static void printMaxSalary(int departmentNumber) {
        System.out.println("Сотрудник с максимальной зарплатой по отделу №:" +
                departmentNumber + " " + findMaxSalary(departmentNumber).getFullName());
    }

    public static double countAverageSalary() {
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                counter++;
            }
        }
        return (double) countSumSalary() / counter;
    }

    public static void printAverageSalary() {
        System.out.println("Среднее значение зарплат: " + countAverageSalary() + " рублей");
    }

    public static double countAverageSalary(int departmentNumber) {
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentNumber() == departmentNumber) {
                counter++;
            }
        }
        return (double) countSumSalary(departmentNumber) / counter;
    }

    public static void printAverageSalary(int departmentNumber) {
        System.out.println("Среднее значение зарплат по отделу №:"
                + departmentNumber + " " + countAverageSalary(departmentNumber) + " рублей");
    }


    public static void printAllNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public static void increaseSalary(int increasePercent) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(Math.toIntExact(Math.round(employee.getSalary() * (1 + (double) increasePercent / 100))));
            }
        }
    }

    public static void increaseSalary(int increasePercent, int departmentNumber) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentNumber() == departmentNumber) {
                employee.setSalary(Math.toIntExact(Math.round(employee.getSalary() * (1 + (double) increasePercent / 100))));
            }
        }
    }

    public static void printEmployeesSalaryLess(int salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println("т/н: " + employee.getId() + ", ФИО: " + employee.getFullName() +
                        ", з/п: " + employee.getSalary() + " рублей");
            }
        }
    }

    public static void printEmployeesSalaryMore(int salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salary) {
                System.out.println("т/н: " + employee.getId() + ", ФИО: " + employee.getFullName() +
                        ", з/п: " + employee.getSalary() + " рублей");
            }
        }
    }
}
