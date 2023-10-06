package com.green.day8.ch5;

public class A_ArrayEx2 {
    public static void main(String[] args){
        /* 5개의 방을 갖고 있는 정수형배열을 만드시고
        각방의 1~10의 랜덤한 값을 넣어주세요
        중복허용
         */

        int[] ran = new int[5];

        for(int i = 0; i<ran.length; i++){
            ran[i] = (int) (Math.random()*10) +1;
        }
        for(int i = 0; i<ran.length; i++){
            System.out.printf("ran [%d] = %d\n", i, ran[i]);
        } //출력하는 걸 합쳐서 하지말고 분리하는 게 더 좋다
    }
}
