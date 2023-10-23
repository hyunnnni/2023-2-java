package com.green.day18.ch7;

import java.util.Arrays;

public class NumberBaseballGame {
    public static void main(String[] args) {
        NumberBaseball nbb = new NumberBaseball(3);
        nbb.start();
    }
}

class NumberBaseball{
    private final int GAME_COUNT;
    private int[] gameNumbers;
    public NumberBaseball(int a){
        GAME_COUNT = a;
        gameNumbers=new int[a];
    }
    public void start(){
        setRandomNumNotDuplicate();
    }

    public void setRandomNumNotDuplicate(){
        for (int i = 0; i < gameNumbers.length; i++) {
            gameNumbers[i] = (int)(Math.random()*10);
            for (int j = 0; j < i; j++) {
                if(gameNumbers[j] == gameNumbers[i]){
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(gameNumbers));
    }
}
