package com.devhamzat.CGPA.calculator;

public class Course {
    private int grade;
    private int creditHours;

    public Course(int grade, int creditHours){
        this.grade = grade;
        this.creditHours = creditHours;
    }
    public int getGrade(){
        return grade;
    }

    public int getCreditHours() {
        return creditHours;
    }
}
