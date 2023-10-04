package com.green.day4.ch4;

public class C_If4 {
    public static void main(String[] args){
        int val = (int)(Math.random()*151)+50;

        String h = "초과";

        if(val <= 100){
            h = "이하";
        }

        System.out.printf("%d = 100%s라서 %d = %d가 됩니다.", val, h, val, val <= 100 ? val * 2 : val + 10);
    }
}
