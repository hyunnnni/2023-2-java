package com.green.day9.ch5;

public class ArrayEx19_1 {
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

        int[] total = new int[score[0].length];

        for(int i = 0; i< score.length; i++){
            int sum = 0;
            System.out.printf("%d\t" , i+1);

            for(int z = 0; z< score[i].length; z++){
                int val = score[i][z];
                sum += val;
                total[z] += val;
                System.out.printf("%d\t" , score[i][z]);
            }
            System.out.printf("%d\t %.1f\n" , sum, sum/(double)score[i].length);
        }
        System.out.println("--------------------------------------------------");
        System.out.print("총점\t");
        for(int val : total){
            System.out.printf("%d\t" , val);
        }
    }
}
