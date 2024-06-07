package main;

import university.Course;
import university.Student;
import university.Enrollment;

public class main {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentId = 1;
        student.name ="John Davis";

        Course course = new Course();
        course.courseId = 102;
        course.courseName = "Java Programming";

        Enrollment enrollment = new Enrollment();
        enrollment.student = student;
        enrollment.course = course;

        System.out.println("Student ID: " + student.studentId + ", Student Name: " + student.name);
        System.out.println("Course ID: " + course.courseId + ", Course Name: " + course.courseName);
        System.out.println("Enrolled Student: " + enrollment.student.name + ", Enrolled Course: " + enrollment.course.courseName);
    }
}
