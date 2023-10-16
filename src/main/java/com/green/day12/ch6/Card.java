package com.green.day12.ch6;

public class Card {
    public String kind;
    public String number;
    /* A:1 j:11 Q:12 k:13
        문자열은 정수형으로
         */

    int getScore(){
        switch (number){
            case "A","a":
                return 1;
            case "J","j":
                return 11;
            case "Q","q":
                return  12;
            case "K","k":
                return 13;
        }
        return Integer.parseInt(number);
    }

    public void printYourSelf(){
        Card c = new Card();
        System.out.printf("%s (%s)\n", kind, number);
    }
}
