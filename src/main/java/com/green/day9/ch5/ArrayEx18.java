package com.green.day9.ch5;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                {101, 102, 103}
                , {21, 22, 23}
                , {31, 32, 33}
                , {41, 42, 43}
        };
        //리터럴 사용 금지(0만 사용 가능)
        //score[0][0] = 101
        //....
        //sum =??

        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
            }
        }
        System.out.println("sum = "+ sum);

        /*int sum = 0;
        for(int i = 0; i< score.length; i++){
            int[] arr = score[i]
            for(int j = 0; j<arr.length; j++){
                sum += arr[j];
                System.out.printf("score[%d][%d] = %d\n", i, j, arr[j]);
            }
        }
        System.out.println("sum = "+ sum);*/

        //향상된 for문 사용해 sum값을 구한다

        int total = 0;
        for(int[] arr : score){ //2차원 배열을 그냥 배열에 넣은 후 한 번 더 넣어주기
            for(int val : arr){// arr의 배열에 있는 값이 하나씩 들어가기 때문에 sum에 +되는 식이 for문에 따라서
                total += val;// ex) sum += 101;   sum += 102;    sum += 103 이런 식으로 진행이 되는거다
            }
        }
        System.out.println("total = "+ total); //이렇게 sum은 따로 빼줘도 좋다
    }
}

