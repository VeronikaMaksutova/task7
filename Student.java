package com.company;

public class Student {
    String name;
    String lastname;
    int GPA;

    public Student(String name, String lastname, int GPA) {
        this.name = name;
        this.lastname= lastname;
        this.GPA= GPA;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname+ '\'' +
                ", GPA=" + GPA +
                '}';
    }
}