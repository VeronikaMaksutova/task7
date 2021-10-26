package com.company;

import java.util.ArrayList;

public class StudentList {
    Student one = new Student("Alexey", "Temnikov", 4);
    Student two = new Student("Genadiy","Sidorov", 5);
    Student three = new Student("Mariya", "Vanina", 2);
    Student four = new Student("Dmitriy", "Aksenov", 3);
    ArrayList<Student>list = new ArrayList<>();
    StudentList(){
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
    }
}
