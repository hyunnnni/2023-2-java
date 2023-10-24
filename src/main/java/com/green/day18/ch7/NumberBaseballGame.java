package com.green.day18.ch7;

import java.util.Arrays;
import java.util.Scanner;

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
        getUserInput();
    }

    private void getUserInput(){
        Scanner scan = new Scanner(System.in);
        final int [] userArr = new int[GAME_COUNT];
        for(int i = 0; i<GAME_COUNT; i++){
            System.out.printf("%d 숫자 >> ", i+1);
            userArr[i] = scan.nextInt();
        }

        boolean r = checkResult(userArr);

        scan.close();
    }

    public boolean checkResult(int[] userArr) {
        int strike = 0, ball = 0, out = 0;
        for (int i = 0; i < gameNumbers.length; i++) {
            for (int z = 0; z < userArr.length; z++) {
                if (gameNumbers[i] == userArr[z]) {
                    if (i == z) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }
        out = GAME_COUNT - (strike + ball);
        return false;
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
