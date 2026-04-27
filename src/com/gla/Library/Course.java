package com.gla.StoryBasedQuestions.OnlineLearning;

class Course {

    int courseId;
    String courseName;
    double price;

    static String platformName = "LearnOnline";

    Course(int courseId, String courseName, double price) {
        this.courseId = courseId;
        this.courseName = formatTitle(courseName);
        this.price = price;
    }

    String formatTitle(String s) {
        String first = s.substring(0,1).toUpperCase();
        String rest = s.substring(1).toLowerCase();
        return first + rest;
    }

    double getFinalPrice() {
        return price;
    }

    void display() {
        System.out.println(platformName + " | " + courseId + " | " + courseName + " | " + getFinalPrice());
    }
}