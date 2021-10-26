package com.company;

import java.util.Comparator;
public class SortingStudentsByGPA implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(((Student)o1).getGPA()>((Student)o2).getGPA()){
            return -1;
        }
        else return 1;
    }
}