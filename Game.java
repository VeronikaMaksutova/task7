package com.company;


import java.util.ArrayDeque;


public class Game {
    boolean playerOneWins= false;
    boolean playerTwoWins= false;
    int n = 0;
    Deque deque= new Deque();
    ArrayDeque<Card>player1 = new ArrayDeque<>();
    ArrayDeque<Card>player2 = new ArrayDeque<>();
    Game(){
        int i = 0;
        deque.Shuffledeque();
        while(i<5){
            player1.push(deque.list.get(i));
            player2.push(deque.list.get(i+5));
            i++;
        }

    }
    public void gameplay() {
        while (!(playerOneWins|| playerTwoWins|| (n >106))) {
            n++;
            if (player1.getFirst().getRank() >player2.getFirst().getRank()) {
                player1.addLast(player1.getFirst());
                player1.removeFirst();
                player1.addLast(player2.getFirst());
                player2.removeFirst();
                if (player2.isEmpty())
                    playerOneWins= true;
            }
            else {
                player2.addLast(player2.getFirst());
                player2.removeFirst();
                player2.addLast(player1.getFirst());
                player1.removeFirst();
                if (player1.isEmpty())
                    playerTwoWins= true;
            }
        }
    }

    @Override
    public String toString() {
        return "Game{" +
                "deque=" + deque +
                ", player1=" + player1 +
                ", player2=" + player2 +
                '}';
    }
}