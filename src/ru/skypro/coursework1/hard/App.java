package ru.skypro.coursework1.hard;

public class App {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Иванов Иван0 Иванович", 1, 20_000);
        employeeBook.addEmployee("Иванов Иван1 Иванович", 2, 30_000);
        employeeBook.addEmployee("Иванов Иван2 Иванович", 3, 25_000);
        employeeBook.addEmployee("Иванов Иван3 Иванович", 4, 32_000);
        employeeBook.addEmployee("Иванов Иван4 Иванович", 5, 40_000);
        employeeBook.addEmployee("Иванов Иван5 Иванович", 1, 42_000);
        employeeBook.addEmployee("Иванов Иван6 Иванович", 1, 22_000);
        employeeBook.addEmployee("Иванов Иван7 Иванович", 2, 25_000);
        employeeBook.addEmployee("Иванов Иван8 Иванович", 3, 26_000);
        employeeBook.addEmployee("Иванов Иван9 Иванович", 4, 27_000);
        employeeBook.addEmployee("Иванов Иван10 Иванович", 1, 20_000);
        employeeBook.printAll();
        System.out.println("---------------------------");
        employeeBook.removeEmployee("Иванов Иван0 Иванович");
        employeeBook.changeEmployeeSalary("Иванов Иван9 Иванович", 30_000);
        employeeBook.changeEmployeeDepartment("Иванов Иван9 Иванович", 5);
        System.out.println("---------------------------");
        employeeBook.printAllByDepartments();
        System.out.println("---------------------------");
        System.out.println("BASIC FUNCTIONAL");
        employeeBook.printSumSalary();
        employeeBook.countSumSalary();
        employeeBook.printMaxSalary();
        employeeBook.printAverageSalary();
        employeeBook.printAllNames();
        System.out.println("---------------------------");
        System.out.println("MIDDLE FUNCTIONAL");
        employeeBook.increaseSalary(8);
        employeeBook.printAll();
        System.out.println("---------------------------");
        employeeBook.printAll(2);
        System.out.println("---------------------------");
        employeeBook.printSumSalary(3);
        System.out.println("---------------------------");
        employeeBook.printMinSalary(2);
        System.out.println("---------------------------");
        employeeBook.printMaxSalary(2);
        System.out.println("---------------------------");
        employeeBook.printAverageSalary(1);
        System.out.println("---------------------------");
        employeeBook.increaseSalary(10, 1);
        employeeBook.printAll(1);
        System.out.println("---------------------------");
        employeeBook.printAll();
        System.out.println("---------------------------");
        employeeBook.printEmployeesSalaryLess(30_000);
        System.out.println("---------------------------");
        employeeBook.printEmployeesSalaryMore(30_000);
    }
}
