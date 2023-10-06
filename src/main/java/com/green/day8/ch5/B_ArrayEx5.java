package com.green.day8.ch5;

public class B_ArrayEx5 {
    public static void main(String[] args){
        //과목점수이다 총점과 평균 점수를 구하라
        int[] score = {100, 98, 100, 100, 90};

        int sum = 0;
        double p = 0;

        for(int i = 0; i<score.length; i++){
            sum += score[i];
        }
        p = sum/(double) score.length;

        System.out.printf("총점은 %d, 평균은 %.1f" , sum, p);
        //p대신 식 자체를 이곳에 적어넣어도 됨 근데 따로 변수를 선언하는 게 이후에 사용하기 좋음
    }
}
