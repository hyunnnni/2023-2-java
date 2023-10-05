package com.green.day7.ch5;

public class A_ArrayMission {
    public static void main(String[] args){//p.184
       int [] arr = {100,200,300,400,500,600};

       //for문과 arr를 이용하여 배열의 모든 방의 값을 출력하십시오
    /* e.g.
       100
       200
       300
       400
       500*/

        System.out.println("e.g.\n");

        for(int i = 0; i < arr.length; i++){ //배열의 길이만큼 수행됨
            System.out.println( arr[i] );

        }
    }
}
