package com.example.lld.SnakeLadder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {

    List<Snake> snake;
    List<Ladder> ladder;
    int size;
    Map<Integer,Integer> boardMap = new HashMap<>();
    
    Board(int size ,List<Snake> snake,List<Ladder> ladder){
        this.size=size;
        this.snake=snake;
        this.ladder=ladder;
        for(Snake snake1:snake){
            boardMap.put(snake1.getStart(),snake1.getEnd());
        }
        for(Ladder ladder1:ladder){
            boardMap.put(ladder1.getStart(),ladder1.getEnd());
        }
    }
    
    public int getPosition(int position){
        if(boardMap.containsKey(position)){
            return boardMap.get(position);
        }
        return position;
    }
}
