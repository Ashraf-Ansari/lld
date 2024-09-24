package com.example.lld.SnakeLadder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Game started");
        Player player1 = new Player("Ashraf");
        Player player2 = new Player("Shoyab");
        Snake snake1 = new Snake(23,7);
        Snake snake2 = new Snake(17,8);
        Ladder ladder1 = new Ladder(5,27);
        Ladder ladder2 = new Ladder(8,20);
        
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        Board board = new Board(30, Arrays.asList(snake1,snake2),Arrays.asList(ladder1,ladder2));
        Game game = new Game(players,new Die(),board);
        game.play();
    }

}
