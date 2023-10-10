package com.green.day8.ch5;

import java.util.Arrays;

public class B_ArrayEx7 {
    public static void main(String[] args) {
        //1. 정수 10개를 저장할 수 있는 배열을 만든다
        //0~9 값을 순차적으로 대입한다
        //2.0~9 값이 순차적으로 있는데 [@]방에 랜덤값을 구해서 넣는다
        //그때 랜덤수가 나오면 원래 있던 그 값과 자리가 체인지가 되게 해준다

        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }
       for(int i = 0; i<num.length; i++){
            int n = (int)(Math.random()*10);
            if( i == n ){continue;}

                int tmp = num[1];
                num[0] = num[n];
                num[n] = tmp;

        }
        System.out.println(Arrays.toString(num));
    }
}
