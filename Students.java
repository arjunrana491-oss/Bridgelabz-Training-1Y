package com.gla.ClassObject.Level2;

public class Students {
    private String name;
    private int rollNumber;
    private int marks;

    public Students(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public char calculateGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 75)
            return 'B';
        else if (marks >= 60)
            return 'C';
        else if (marks >= 40)
            return 'D';
        else
            return 'F';
    }

    public void showStudentReport() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Students s1 = new Students("Abhay", 02, 93);

        System.out.println("Student Report:");
        s1.showStudentReport();
    }
}
