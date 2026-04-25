package com.gla.StoryBasedQuestions.OnlineLearning;

class RecordedCourse extends Course {

    RecordedCourse(int courseId, String courseName, double price) {
        super(courseId, courseName, price);
    }

    double getFinalPrice() {
        return price - (price * 0.10);
    }
}