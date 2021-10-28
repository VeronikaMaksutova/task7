package com.company;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println(game.toString());
        game.gameplay();
        System.out.println(game.toString());
        if(game.playerOneWins)
            System.out.println("first " + game.n);
        else if(game.playerTwoWins)
            System.out.println("second " + game.n);
        else System.out.println("botva");
    }
}
