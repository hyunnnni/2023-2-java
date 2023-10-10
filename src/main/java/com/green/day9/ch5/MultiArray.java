package com.green.day9.ch5;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args){ //p.214 다차원 배열
        int[][] arr = {//2차원 배열이다 배열안에 여러 개의 정수타입 배열이 있는 것
                {100, 200},//0번방
                {300, 400},//1번방
                {500, 600}//2번방
        };
        System.out.println(arr[0][0]);//행 열
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);

        int[] intArr  = arr[2];

        System.out.println(intArr[1]);

        int[] newIntArr = {1, 2, 3, 4};
        arr[0] = newIntArr;


        System.out.println("arr,length : " + arr.length);
        System.out.println("arr [0].length : "+ arr[0].length); //arr의 배열 길이를 보여주는 코드
    }
}
