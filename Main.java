package com.company;
//упражнение 2
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        StudentList example = new StudentList();
        for(Student student:example.list){
            System.out.println(student.toString());
        }
        Collections.sort(example.list, new SortingStudentsByGPA());
        System.out.println("После сортировки:");
        for(Student student:example.list){
            System.out.println(student.toString());
        }
    }
}