package com.Babatunde;

public class Student {
    String firstName;
    String lastName;
    int grade;
    int age;

    public Student () {
        this("John", "Doe", 70, 20);
    }

    public Student (String firstName, String lastName, int grade) {
        this(firstName, lastName, grade, 20);
    }

    public Student (String firstName, String lastName) {
        this(firstName, lastName, 70, 20);
    }

    public Student (String firstName, String lastName, int grade, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.age = age;
        System.out.println("Student created");
    }

    public Student(String fullname) {
        this(fullname.split(" ")[0], fullname.split(" ")[1]);
    }

    void changeName (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void changeGrade (int grade) {
        this.grade = grade;
    }

    void changeAge (int age) {
        this.age = age;
    }

    void print () {
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Grade: " + this.grade);
        System.out.println("Age: " + this.age);
    }

    // Garbage collector
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Student is destroyed by the Garbage Collector");
        super.finalize();
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
