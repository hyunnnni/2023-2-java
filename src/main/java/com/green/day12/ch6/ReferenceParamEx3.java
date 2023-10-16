package com.green.day12.ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4};
        printArr(arr);//배열을 출력한 거 처럼 보이게 한 거
        System.out.println(Arrays.toString(arr));//원래 배열로 출력

        sortArr(arr);//앞에 .이 없다라는 건 같은 공간에 있다는 뜻 .ReferenceParamEx3이 생략된거다
        //정열이 됐다

        System.out.println(Arrays.toString(arr));//정열된 배열로 출력

        //------------------------------------------------------------
        System.out.println("sum = " + sumArr(arr)); //return 메소드를 써야된다


    }

    public static void sortArr(int[] arr) {//오름차순 오른쪽부터 큰 수가 채워진다 버블정열
        int tmp = 0;
        for (int i = arr.length - 1; i > 0; i--) {//비교가 되야 하는 수
            for (int z = 0; z < i; z++) {//한 줄씩 검증할 때 되어야 하는 수( i가 점점 줄어든다 )
                //큰 자리 수가 오른쪽에 먼저 차례대로 정열 되니깐 정열 될수록 검증할 필요가 없으니깐
                int nIdx = z + 1;//바로 다음 방을 비교 하기 위한 변수
                if (arr[z] > arr[nIdx]) {//한 방씩 비교, z가 점점 증가하면서 다음 방으로 차례대로 비교가 된다
                    //앞 방의 크기가 뒷 방보다 크다면 두 자리를 스와핑
                    tmp = arr[z];
                    arr[z] = arr[nIdx];
                    arr[nIdx] = tmp;//스와핑 하는 거
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void printArr(int[] arr) {
        System.out.print("[" + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.println("]");
    }

    public static int sumArr(int[] arr) { //같은 클래스 안에 있으니 static을 붙인 리턴 메소드
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
