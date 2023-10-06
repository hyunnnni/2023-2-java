package com.green.day8.ch5;

import java.util.Arrays;

public class A_ArrayToStringMission {
    public static void main(String[] args){
        //for문을 활용하여 콘솔에 [5,10,7,3]
       int[] arr = {5,10,7,3,11};
        System.out.println(Arrays.toString(arr));

        System.out.printf("[%d", arr[0]); //분기문과 계산 전부 다 안해도 되는 좋은 코드~! 내가 했지롱~! 오예~!
        for(int i = 1; i<arr.length; i++){
            System.out.printf(", %d", arr[i]);
        }
        System.out.print("]");

        System.out.println();

        int com = arr.length-1; //if문 ()안에 연산을 넣고 싶다면 미리 계산해서 선언초기화 후 넣는 게 좋다

        System.out.print("[");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
            if(i<com){
                System.out.print(", ");
            }
        }
        System.out.print("]");

        System.out.println();

        System.out.print("[");//계산을 하지않고 더 간결한 방법
        for(int i = 0; i<arr.length; i++){
            if(i != 0){
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");

        //----------------------------------------------------------------------------------------------------

        System.out.println();

        System.out.print("[");
        for(int i = 0; i<arr.length; i++){
            System.out.print(i<com ? arr[i] +" ," : arr[i]); //삼항식을 사용한 방식 좋은 방식은 아님
        }
        System.out.print("]");


    }
}
