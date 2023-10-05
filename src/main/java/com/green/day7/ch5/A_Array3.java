package com.green.day7.ch5;

public class A_Array3 {
    public static void main(String[] args){//딥카피
        int[] arr1 = { 5,10,15 };
        int[] arr2 = new int[arr1.length]; //이 방은 arr1과 크기가 같다 대신 안의 수는 0으로 셋팅됨

        for(int i = 0; i<arr1.length; i++) {
            arr2[i] = arr1[i]; //새 방에 arr1의 수만 카피해서 복사해 대입했다
        }

        //동등성 : a,b 가 같은 값을 갖고 있는가 (epuals) 딥카피
        //동일성 : a,b 가 같은 주소값을 들고 있는가 (==) 셸로우카피

        arr2[1] = 200; // 그래서 Array2에서 했던 것과 다르게 arr2의 1번째 수를 200으로 바꿔도 arr1의 배열은 수정되지 않는다
        for(int i = 0; i<arr1.length; i++) {
            System.out.printf("arr1[%d] : %d\n", i, arr1[i]);
        }

        for (int i = 0; i<arr2.length; i++){
            System.out.printf("arr2[%d] : %d\n", i, arr2[i]);
        }
    }
}
