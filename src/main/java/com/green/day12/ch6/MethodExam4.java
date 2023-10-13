package com.green.day12.ch6;

import java.util.Arrays;

public class MethodExam4 {

    int[] plusMap (int[] a, int num){
        int [] arr2 = new int[a.length];
        for(int i = 0; i< arr2.length; i++){
            arr2[i] = a[i]; //딥카피 하는 중
            arr2[i] += num;
            //temp[i] = arr[i] + num; 으로 줄일 수 있다
        }

        return arr2;

    }

    int[] plusOrigin (int[] a, int num){
        int [] arr2 = a;
        for(int i = 0; i< arr2.length; i++){
            arr2[i] += num;
        }

        return arr2;

    }

    int[] randomValFromTo (int n1,int min,int max){
        int [] arr2 = new int[n1];
        for(int i = 0; i<arr2.length; i++){
            arr2[i]= (int)(Math.random()*(max-min+1))+min;
        }
        return arr2;
    }
    public static void main(String[] args) {
        MethodExam4 me4 = new MethodExam4();

        int[] arr = { 10, 20, 30, 40, 50 };
        int[] rArr = me4.plusMap(arr,2);
        System.out.println(Arrays.toString(arr));//[ 10, 20, 30]
        System.out.println(Arrays.toString(rArr)); //[12, 22, 32]

        me4.plusOrigin(arr,4); //return을 써도 되긴 한다 근데 구별을 할 수는 있어야 됨 난 실패~!
        System.out.println(Arrays.toString(arr));

        int[] rArr2 = me4.randomValFromTo(10, 5, 20); //배열크기, 랜덤 min값, 랜덤 max값
        System.out.println(Arrays.toString(rArr2));
    }
}
