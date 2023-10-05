package com.green.day7.ch5;

public class A_Array2 {
    public static void main(String[] args){//p.182
        int[] arr1 = { 100, 200 };
        int[] arr2 = {5, 10, 15 }; //이런 식으로 새로운 주소값을 만들어줘야 새로운 방번호가 더 추가되거나 빠지거나 할 수 있다
        //다른 방식으로는 추가나 빼기가 안된다

        for (int i = 0; i<arr1.length; i++){
            System.out.printf ("arr1[%d] : %d\n", i , arr1[i]);
        }

        arr1= arr2;//셸로우카피 저 배열에 접근할 수 있는 주소값만 복사한 행위

        arr1[1] =44;
        arr2[2] =55; //이렇게 해도 배열 자체가 변경이 되는거기 때문에 arr1이든 arr2이든 다 바뀐 결과가 나온다 arr1,2는 주소값일 뿐

        for (int i = 0; i<arr1.length; i++) {
            System.out.printf("arr1[%d] : %d\n", i, arr1[i]);
        }

        for (int i = 0; i<arr2.length; i++){
            System.out.printf ("arr2[%d] : %d\n", i , arr2[i]);
        }
        System.out.println("arr1 == arr2 : " + (arr1 == arr2)); //레퍼런스끼리 == 은 주소값 비교


    }
}
