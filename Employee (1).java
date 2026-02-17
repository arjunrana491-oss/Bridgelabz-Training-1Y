package com.gla.ClassObject.Level1;

public class Employee {
    private String name;
    private String id;
    private int salary;

    public Employee(String name, String id,int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void ShowEmployeeDetails() {
        System.out.println("Employee name: " +name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary:" +salary);
    }

    public static void main() {
        Employee e1 = new Employee("Abhay Jaat","12515000027",75000);
        System.out.println("Details of Employee 1:");
        e1.ShowEmployeeDetails();
    }
}
