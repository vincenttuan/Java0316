package com.ocp.day18;

public class Student extends Person {
    private int score;

    public Student() {
    }

    public Student(int score, String name, int age) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + "score=" + score + '}';
    }
    
}
