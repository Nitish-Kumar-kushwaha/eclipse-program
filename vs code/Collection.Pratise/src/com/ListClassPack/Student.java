package com.ListClassPack;

public class Student {
    private int rollNo;
    private String name;
    private String course;
    private float fees;
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public float getFees() {
        return fees;
    }
    public void setFees(float fees) {
        this.fees = fees;
    }

    public Student(int rollNo, String name, String course, float fees) {
        super();
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.fees = fees;
    }
    
    
    
}
