package ru.skypro.coursework1.middle;

public class App {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван0 Иванович", 1, 20_000);
        employees[1] = new Employee("Иванов Иван1 Иванович", 1, 30_000);
        employees[2] = new Employee("Иванов Иван2 Иванович", 2, 40_000);
        employees[3] = new Employee("Иванов Иван3 Иванович", 2, 50_000);
        employees[4] = new Employee("Иванов Иван4 Иванович", 2, 60_000);
        printAll(employees);
        printDelimiter();
        increaseSalary(employees, 8);
        printAll(employees);
        printDelimiter();
        printAll(employees, 2);
        printDelimiter();
        printSumSalary(employees, 3);
        printDelimiter();
        printMinSalary(employees, 2);
        printDelimiter();
        printMaxSalary(employees, 2);
        printDelimiter();
        printAverageSalary(employees, 1);
        printDelimiter();
        increaseSalary(employees, 10, 1);
        printAll(employees, 1);
        printDelimiter();
        printAll(employees);
        printDelimiter();
        printEmployeesSalaryLess(employees, 40_000);
        printDelimiter();
        printEmployeesSalaryMore(employees, 40_000);
    }

    private static void printDelimiter() {
        System.out.println("*****************************");
        System.out.println("*****************************");
    }

    public static void printAll(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static void printAll(Employee[] employees, int departmentNumber) {
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

    public static int countSumSalary(Employee[] employees) {
        int sumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumSalary += employee.getSalary();
            }
        }
        return sumSalary;
    }

    public static int countSumSalary(Employee[] employees, int departmentNumber) {
        int sumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && departmentNumber == employee.getDepartmentNumber()) {
                sumSalary += employee.getSalary();
            }
        }
        return sumSalary;
    }

    public static void printSumSalary(Employee[] employees) {
        System.out.println("Сумма затрат на зарплаты в месяц: " + countSumSalary(employees) + " рублей");
    }

    public static void printSumSalary(Employee[] employees, int departmentNumber) {
        System.out.println("Сумма затрат на зарплаты в месяц по отделу №:"
                + departmentNumber + " " + countSumSalary(employees, departmentNumber) + " рублей");
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

    public static Employee findMinSalary(Employee[] employees, int departmentNumber) {
        int minSalary = Integer.MAX_VALUE;
        int j = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < minSalary
                    && employees[i].getDepartmentNumber() == departmentNumber) {
                minSalary = employees[i].getSalary();
                j = i;
            }
        }
        return employees[j];
    }

    public static void printMinSalary(Employee[] employees, int departmentNumber) {
        System.out.println("Сотрудник с минимальной зарплатой по отделу №:" +
                departmentNumber + " " + findMinSalary(employees, departmentNumber).getFullName());
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

    public static Employee findMaxSalary(Employee[] employees, int departmentNumber) {
        int maxSalary = Integer.MIN_VALUE;
        int j = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalary
                    && employees[i].getDepartmentNumber() == departmentNumber) {
                maxSalary = employees[i].getSalary();
                j = i;
            }
        }
        return employees[j];
    }

    public static void printMaxSalary(Employee[] employees, int departmentNumber) {
        System.out.println("Сотрудник с максимальной зарплатой по отделу №:" +
                departmentNumber + " " + findMaxSalary(employees, departmentNumber).getFullName());
    }

    public static double countAverageSalary(Employee[] employees) {
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                counter++;
            }
        }
        return (double) countSumSalary(employees) / counter;
    }

    public static void printAverageSalary(Employee[] employees) {
        System.out.println("Среднее значение зарплат: " + countAverageSalary(employees) + " рублей");
    }

    public static double countAverageSalary(Employee[] employees, int departmentNumber) {
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentNumber() == departmentNumber) {
                counter++;
            }
        }
        return (double) countSumSalary(employees, departmentNumber) / counter;
    }

    public static void printAverageSalary(Employee[] employees, int departmentNumber) {
        System.out.println("Среднее значение зарплат по отделу №:"
                + departmentNumber + " " + countAverageSalary(employees, departmentNumber) + " рублей");
    }


    public static void printAllNames(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public static void increaseSalary(Employee[] employees, int increasePercent) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(Math.toIntExact(Math.round(employee.getSalary() * (1 + (double) increasePercent / 100))));
            }
        }
    }

    public static void increaseSalary(Employee[] employees, int increasePercent, int departmentNumber) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentNumber() == departmentNumber) {
                employee.setSalary(Math.toIntExact(Math.round(employee.getSalary() * (1 + (double) increasePercent / 100))));
            }
        }
    }

    public static void printEmployeesSalaryLess(Employee[] employees, int salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println("т/н: " + employee.getId() + ", ФИО: " + employee.getFullName() +
                        ", з/п: " + employee.getSalary() + " рублей");
            }
        }
    }

    public static void printEmployeesSalaryMore(Employee[] employees, int salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salary) {
                System.out.println("т/н: " + employee.getId() + ", ФИО: " + employee.getFullName() +
                        ", з/п: " + employee.getSalary() + " рублей");
            }
        }
    }
}
