package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Deque {
    ArrayList<Card>list = new ArrayList<>();
    Deque(){
        int i=0;
        while (i<10){
            Card card = new Card(i);
            list.add(card);
            i++;
        }
    }
    public void Shuffledeque(){
        list.sort(new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                int a = (int)(Math.random()*10);
                if(a<5){
                    return 1;
                }
                else return -1;
            }
        });
    }

    @Override
    public String toString() {
        return "deque{" +
                "list=" + list +
                '}';
    }
}
