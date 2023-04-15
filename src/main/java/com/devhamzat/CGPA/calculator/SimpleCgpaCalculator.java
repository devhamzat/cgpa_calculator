package com.devhamzat.CGPA.calculator;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimpleCgpaCalculator  implements CgpaCalculator{
    @Override
    public double calculateCgpa(List<Course> courses) {
        double totalGradePoints = 0;
        int totalCreditHours = 0;
        for (Course course:courses) {
            totalGradePoints += course.getGrade()* course.getCreditHours();
            totalCreditHours += course.getCreditHours();
        }
        double cgpa = totalGradePoints/totalCreditHours;
        return cgpa;
    }
}
