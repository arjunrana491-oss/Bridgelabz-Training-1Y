package com.gla.encapsulation;

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    Employee(int employeeId,String name,double baseSalary) {
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId=employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary=baseSalary;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Name: "+name);
        System.out.println("Base Salary: "+baseSalary);
    }
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    FullTimeEmployee(int id,String name,double salary) {
        super(id,name,salary);
    }

    public double calculateSalary() {
        return getBaseSalary();
    }

    public void assignDepartment(String dept) {
        department=dept;
    }

    public String getDepartmentDetails() {
        return department;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: "+department);
        System.out.println("Total Salary: "+calculateSalary());
    }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    PartTimeEmployee(int id,String name,double baseSalary,int hoursWorked,double hourlyRate) {
        super(id,name,baseSalary);
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;
    }

    public double calculateSalary() {
        return hoursWorked*hourlyRate;
    }

    public void assignDepartment(String dept) {
        department=dept;
    }

    public String getDepartmentDetails() {
        return department;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: "+department);
        System.out.println("Hours Worked: "+hoursWorked);
        System.out.println("Total Salary: "+calculateSalary());
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees=new Employee[2];

        FullTimeEmployee e1=new FullTimeEmployee(101,"Rahul",60000);
        e1.assignDepartment("IT");

        PartTimeEmployee e2=new PartTimeEmployee(102,"Neha",0,80,500);
        e2.assignDepartment("Support");

        employees[0]=e1;
        employees[1]=e2;

        for(Employee e:employees) {
            e.displayDetails();
            System.out.println();
        }
    }
}