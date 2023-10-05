package com.green.day7.ch5;

public class A_Array4 {
    public static void main(String[] args){//딥카피
        int[] arr1 = { 5,10,15 };
        int[] arr2 = new int[arr1.length]; //이 방은 arr1과 크기가 같다 대신 안의 수는 0으로 셋팅됨

        for(int i = 0; i<arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[1] = 200;
        for(int i = 0; i<arr1.length; i++) {
            System.out.printf("arr1[%d] : %d\n", i, arr1[i]);
        }

        for (int i = 0; i<arr2.length; i++){
            System.out.printf("arr2[%d] : %d\n", i, arr2[i]);
        }
    }
}
