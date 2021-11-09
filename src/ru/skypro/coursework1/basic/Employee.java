package ru.skypro.coursework1.basic;

public class Employee {
    private static int counter = 0;
    private final String fullName;
    private final int id;
    private int departmentNumber;
    private int salary;

    public Employee(String fullName, int departmentNumber, int salary) {
        this.fullName = fullName;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        this.id = ++counter;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "т/н: " + id + ", ФИО: " + fullName + ", № отдела: " + departmentNumber +
                ", з/п: " + salary + " рублей";
    }
}
