package com.gla.StoryBasedQuestions.StudentResult;

public class MainApp {

    public static void main(String[] args) {

        EngineeringStudent s = new EngineeringStudent(101, "Abhay", 88, "CSE");

        System.out.println("Student: " + s.getStudentInfo());
        System.out.println("Grade: " + s.calculateGrade());
    }
}