package com.green.day7.ch5;

public class A_Array3_Mission {
    public static void main(String[] args){
       int [] arr1 = {5, 10, 15 };
       //arr 2는 길이가 4, arr1과 같은 방은 같은 값을 가지고 있고
        //마지막 (3번방) 방은 20을 갖고 있는 배열을 만들어라]

        int [] arr2 = new int [4]; //arr1.length+1로 하는게 더 좋다 배열의 값이 더 늘어났을 때 적용되기 쉽게 리터럴은 최대한 안 쓰는게 좋다

        for(int i = 0; i < arr1.length; i++){
            arr2 [i] = arr1 [i];
        }

        arr2 [3] = 20; //arr1.length로 넣는다 arr1은 arr2의 방번호보다 한 칸 더 적으니깐 이렇게 넣어준다

        for(int i = 0; i< arr1.length; i++) {
            System.out.printf("arr1[%d] : %d\n" , i, arr1[i]);
        }
        for(int i = 0; i< arr2.length; i++) {
            System.out.printf("arr2[%d] : %d\n", i, arr2[i]);
        }


    }
}
