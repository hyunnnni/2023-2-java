package com.green.day7.ch5;

public class A_Array3_Mission {
    public static void main(String[] args){
       int [] arr1 = {5, 10, 15 };
       //arr 2는 길이가 4, arr1과 같은 방은 같은 값을 가지고 있고
        //마지막 (3번방) 방은 20을 갖고 있는 배열을 만들어라]

        int [] arr2 = new int [4]; //arr1.length+1로 하는게 더 좋다 배열의 값이 더 늘어났을 때 적용되기 쉽게 리터럴은 최대한 안 쓰는게 좋다

        for(int i = 0; i < arr1.length; i++){ //딥카피
            arr2 [i] = arr1 [i];
        }

        arr2 [3] = 20; //arr2.length - 1로 넣는다 나머지는 리터럴로 설정할 수 있는데 마지막 번호는 늘어날 경우가 있기에

        for(int i = 0; i< arr1.length; i++) {
            System.out.printf("arr1[%d] : %d\n" , i, arr1[i]);
        }
        for(int i = 0; i< arr2.length; i++) {
            System.out.printf("arr2[%d] : %d\n", i, arr2[i]);
        }


    }
}
