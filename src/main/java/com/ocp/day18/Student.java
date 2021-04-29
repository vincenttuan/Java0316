package com.ocp.day18;

public class Student extends Person {
    private int score;
    private Teacher teacher;

    public Student() {
    }

    public Student(int score, Teacher teacher, String name, int age) {
        super(name, age);
        this.score = score;
        this.teacher = teacher;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" + "score=" + score + ", teacher=" + teacher + '}';
    }
    
    
    
}
