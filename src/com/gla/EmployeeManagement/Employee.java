package com.gla.StoryBasedQuestions.EmployeeManagement;

class Employee {

    int empId;
    String name;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    String generateEmail() {
        return name.toLowerCase() + "@company.com";
    }
}