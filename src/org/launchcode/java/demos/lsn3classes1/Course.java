package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;
import java.util.Objects;

public class Course {

    private String subject;
    private String department;
    private String instructor;
    private HashMap<Student, Integer> studentRoster;
    // Integer in studentRoster represents grade in class

    public Course(String subject, String department, String instructor, HashMap<Student, Integer> studentRoster) {
        this.subject = subject;
        this.department = department;
        this.instructor = instructor;
        this.studentRoster = studentRoster;
    }

    public void setName(String name) {
        this.subject = subject;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    public void setStudentRoster(HashMap<Student, Integer> studentRoster) {
        this.studentRoster = studentRoster;
    }

    public String getSubject() {
        return subject;
    }
    public String getDepartment() {
        return department;
    }
    public String getInstructor() {
        return instructor;
    }
    public HashMap<Student, Integer> getStudentRoster() {
        return studentRoster;
    }

    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", department='" + department + '\'' +
                ", instructor='" + instructor + '\'' +
                ", studentRoster=" + studentRoster +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return subject.equals(course.subject) && department.equals(course.department) && instructor.equals(course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, department, instructor);
    }
}

// course needs name, department, instructor(string), student roster, number of seats(available/filled),