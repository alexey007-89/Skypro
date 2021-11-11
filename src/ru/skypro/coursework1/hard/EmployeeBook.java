package ru.skypro.coursework1.hard;

public class EmployeeBook {
    private final Employee[] employees;

    EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String fullName, int departmentNumber, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                Employee newEmployee = new Employee(fullName, departmentNumber, salary);
                employees[i] = newEmployee;
                return;
            }
        }
        System.out.println("Employee book is full. Can't add a new employee.");
    }

    public void removeEmployee(String fullName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName().equals(fullName)) {
                employees[i] = null;
                System.out.println("Employee " + fullName + " is removed.");
                return;
            }
        }
        System.out.println("Employee " + fullName + " is not found.");
    }

    public void changeEmployeeDepartment(String fullName, int departmentNumber) {
        for (Employee employee : employees) {
            if (employee != null && employee.getFullName().equals(fullName)) {
                employee.setDepartmentNumber(departmentNumber);
                System.out.println(fullName + " переведен в отдел №" + departmentNumber);
                return;
            }
        }
        System.out.println("Employee " + fullName + " is not found.");
    }

    public void changeEmployeeSalary(String fullName, int salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getFullName().equals(fullName)) {
                employee.setSalary(salary);
                System.out.println("Зарплата " + fullName + " изменена, и теперь состовляет " + salary + " рублей");
                return;
            }
        }
        System.out.println("Employee " + fullName + " is not found.");
    }

    public void printAllByDepartments() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Отдел №" + i + ":");
            printAll(i);

        }
    }

    public void printAll() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public void printAll(int departmentNumber) {
        for (Employee employee : employees) {
            if (employee != null && departmentNumber == employee.getDepartmentNumber()) {
                System.out.println("т/н: " + employee.getId() + ", ФИО: " + employee.getFullName() +
                        ", з/п: " + employee.getSalary() + " рублей");
            }
        }
    }

    public int countSumSalary() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumSalary += employee.getSalary();
            }
        }
        return sumSalary;
    }

    public int countSumSalary(int departmentNumber) {
        int sumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && departmentNumber == employee.getDepartmentNumber()) {
                sumSalary += employee.getSalary();
            }
        }
        return sumSalary;
    }

    public void printSumSalary() {
        System.out.println("Сумма затрат на зарплаты в месяц: " + countSumSalary() + " рублей");
    }

    public void printSumSalary(int departmentNumber) {
        System.out.println("Сумма затрат на зарплаты в месяц по отделу №:"
                + departmentNumber + " " + countSumSalary(departmentNumber) + " рублей");
    }

    public Employee findMinSalary() {
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

    public void printMinSalary() {
        System.out.println("Сотрудник с минимальной зарплатой:\n" + findMinSalary());
    }

    public Employee findMinSalary(int departmentNumber) {
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

    public void printMinSalary(int departmentNumber) {
        System.out.println("Сотрудник с минимальной зарплатой по отделу №:" +
                departmentNumber + " " + findMinSalary(departmentNumber).getFullName());
    }

    public Employee findMaxSalary() {
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

    public void printMaxSalary() {
        System.out.println("Сотрудник с максимальной зарплатой:\n" + findMaxSalary());
    }

    public Employee findMaxSalary(int departmentNumber) {
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

    public void printMaxSalary(int departmentNumber) {
        System.out.println("Сотрудник с максимальной зарплатой по отделу №:" +
                departmentNumber + " " + findMaxSalary(departmentNumber).getFullName());
    }

    public double countAverageSalary() {
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                counter++;
            }
        }
        return (double) countSumSalary() / counter;
    }

    public void printAverageSalary() {
        System.out.println("Среднее значение зарплат: " + countAverageSalary() + " рублей");
    }

    public double countAverageSalary(int departmentNumber) {
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentNumber() == departmentNumber) {
                counter++;
            }
        }
        return (double) countSumSalary(departmentNumber) / counter;
    }

    public void printAverageSalary(int departmentNumber) {
        System.out.println("Среднее значение зарплат по отделу №:"
                + departmentNumber + " " + countAverageSalary(departmentNumber) + " рублей");
    }


    public void printAllNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public void increaseSalary(int increasePercent) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(Math.toIntExact(Math.round(employee.getSalary() * (1 + (double) increasePercent / 100))));
            }
        }
    }

    public void increaseSalary(int increasePercent, int departmentNumber) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentNumber() == departmentNumber) {
                employee.setSalary(Math.toIntExact(Math.round(employee.getSalary() * (1 + (double) increasePercent / 100))));
            }
        }
    }

    public void printEmployeesSalaryLess(int salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println("т/н: " + employee.getId() + ", ФИО: " + employee.getFullName() +
                        ", з/п: " + employee.getSalary() + " рублей");
            }
        }
    }

    public void printEmployeesSalaryMore(int salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salary) {
                System.out.println("т/н: " + employee.getId() + ", ФИО: " + employee.getFullName() +
                        ", з/п: " + employee.getSalary() + " рублей");
            }
        }
    }


}
