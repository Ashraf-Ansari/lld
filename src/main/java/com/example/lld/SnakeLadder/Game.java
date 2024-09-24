package com.example.lld.SnakeLadder;

import java.util.List;
import java.util.Queue;

public class Game {
    List<Player> players;
    Die die;
    Board board;
    
    Game(List<Player> players,Die die,Board board){
        this.players=players;
        this.die=die;
        this.board=board;
    }
    
    public void play(){
        if(players.size()>1) {
            while (true) {
                
                Player player = players.remove(0);
                System.out.println("Player.name "+player.getName()+" "+player.currentPosition());
                int roll = die.roll();
                
                int newPosition = player.currentPosition()+roll;
                
                if(newPosition>board.size){
                    newPosition = player.currentPosition();
                }
                else {
                    newPosition = board.getPosition(newPosition);
                }
                
                if(newPosition==board.size){
                    System.out.println("Congratulation "+player.getName()+": You have Won the match");
                    return;
                }
                
                player.setPosition(newPosition);
                
                players.add(player);
                
            }
        }
    }
}
