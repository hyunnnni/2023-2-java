package com.green.day2.Ch2;

public class CharEx {
    public static void main(String[] args){
        char ch ='4';
        int val = 66;

        System.out.printf("%c: %d\n", ch, (int)ch); //정수로 변환됨으로서 아스키코드로 표현됨
        System.out.printf("%c: %d\n", (char)val, val);
    }
}
