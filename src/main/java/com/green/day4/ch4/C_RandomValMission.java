package com.green.day4.ch4;

public class C_RandomValMission {
    public static void main (String[] args) {
        int rVal = (int) (Math.random() * 6) + 5; //곱한 수는 -1한게 곱했을 때 최대값이 된다 (1.000-이 절대 안 나오기 때문)

        System.out.println(rVal);

        int rVal2 = (int) (Math.random() * 10) + 14;
        System.out.println(rVal2);
    }
}
