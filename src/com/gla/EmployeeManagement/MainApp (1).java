package com.gla.StoryBasedQuestions.EmployeeManagement;

public class MainApp {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Rahul");
        Employee e2 = new Manager(102, "Amit", "Sales");

        System.out.println(e1.generateEmail());
        System.out.println(e2.generateEmail());
    }
}