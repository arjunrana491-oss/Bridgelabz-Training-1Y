package com.gla.StoryBasedQuestions.OnlineLearning;

class LiveCourse extends Course {

    LiveCourse(int courseId, String courseName, double price) {
        super(courseId, courseName, price);
    }

    double getFinalPrice() {
        return price - (price * 0.05);
    }
}