package ru.skypro.basic.coursework1.hard;

public class Employee {
    private static int counter;
    private final String fullName;
    private final int id = ++counter;
    private int departmentNumber;
    private int salary;

    public Employee(String fullName, int departmentNumber, int salary) {
        this.fullName = fullName;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
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
