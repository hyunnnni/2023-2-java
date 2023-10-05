package com.green.day7.ch5;

public class A_Array {
    public static void main(String[] args){//p.182
        //배열 : 여러개의 값을 하나에 묶어 담을 수 있는 것
        int[] arr = {10, 20, 30}; //기본형을 제외하곤 전부 참조형 레퍼런스 메모리 주소값만 저장
        //변수에는 값을 하나 밖에 저장을 못한다 arr에는 저 배열에 접근할 수 있는 주소값을 저장한 것이다
        //타입이 같은 거만 모아서 넣을 수 있다
        //한 번 정하면 배열을 더 추가하거나 뺄 수 없다

        int[] arr2 = new int[3];//방만 만들겠다 각 방에는 0이 들어가있음 []은 그 크기만큼의 방을 만들겠다라는 뜻
        System.out.println("arr[0] : " + arr[0]);//arr[] 배열을 읽어오는 것 주소값, 대괄호, 방번호
        System.out.println("arr[1] : " + arr[1]);
        System.out.println("arr[2] : " + arr[2]);
        //배열에는 각 순서를 부여하는데 인덱스라고 함 0부터 시작

        arr[0] = 200; //쓰기 : =(대입연산자)

        System.out.println("arr.lenght : " + arr.length); //배열의 길이


    }
}
