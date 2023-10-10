package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx19 {
    public static void main(String[] args){
        //0번째 행은 국어점수 1번째 행은 영어점수 2번째 행은 수학점수
        //열의 인덱스 번호는 1-5로 이름을 정해준다
        //번호 국어 영어 수학 총점 평균  이렇게 쪼로록 구해라 평균은 실수 한 자리까지
        int[][] score = {
                {101, 102, 103}
                , {21, 22, 23}
                , {31, 32, 33}
                , {41, 42, 43}
                , {51, 52, 53}
        };
        System.out.println("번호\t국어\t영어\t수학\t총점\t 평균");
        System.out.println("------------------------------------------");

/* 내가 푼 거
        for(int i = 0; i < score.length; i++){
            int[] arr = score[i];
            int sum = 0;
            double t = 0;

            System.out.printf("%d\t", i+1);
            for(int z = 0; z<arr.length; z++){
                sum += arr[z];
                t = sum/(double)arr.length;
                System.out.printf("%d\t", arr[z]);
            }
            System.out.printf("%d\t%.1f\n", sum, t);

        }
        System.out.println("----------------------------------------------");
        System.out.print("총점\t");

        for(int i = 0; i<score[0].length; i++){
            int total = 0;
            for(int z = 0; z<score.length; z++){
                total += score[z][i];
            }
            System.out.printf("%d\t" , total);
        }*/

        //-------------------------------------------------------------------책에 나온 거
        int kor = 0;
        int eng = 0;
        int math = 0;

        for(int i = 0; i < score.length; i++){
            int[] arr = score[i];
            int sum = 0;
            double t = 0;

            kor += score[i][0];
            eng += score[i][1];
            math += score[i][2];

            System.out.printf("%d\t", i+1);
            for(int z = 0; z<arr.length; z++){
                sum += arr[z];
                t = sum/(double)arr.length;
                System.out.printf("%d\t", arr[z]);
            }
            System.out.printf("%d\t%.1f\n", sum, t);

        }
        System.out.println("----------------------------------------------");
        System.out.printf("총점\t%d\t%d\t%d", kor, eng, math);

        //----------------------------------------------------------------- 선생님이 알려주신 거
        int[] sumArr = new int[score[0].length];

        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        System.out.println("----------------------------------");
        for(int i = 0; i< score.length; i++) {
            System.out.printf("%d", i+1);
            int sum = 0;
            for(int z = 0; z < score[i].length; z++) {
                int val = score[i][z];
                sumArr[z] += val;
                sum += val;
                System.out.printf("\t%d", val);
            }
            float avg = (float)sum / score[i].length;
            System.out.printf("\t%d\t%.1f\n", sum, avg);
        }
        System.out.println("----------------------------------");
        System.out.print("총점");
        for(int val : sumArr) {
            System.out.printf("\t%d", val);
        }
        System.out.println();
    }
}
