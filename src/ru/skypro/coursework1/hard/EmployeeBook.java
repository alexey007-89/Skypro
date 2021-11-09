package ru.skypro.coursework1.hard;

public class EmployeeBook {
    private final Employee[] employees;

    EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String fullName, int departmentNumber, int salary) {
        for (Employee employee : employees) {
            if (employee != null) {
                Employee newEmployee = new Employee(fullName, departmentNumber, salary);
                return;
            }
        }
        System.out.println("Employee book is full. Adding a new employee is restricted.");
    }


}
