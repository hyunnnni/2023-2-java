package com.green.day2.Ch2;

public class OverflowEx {
    public static void main(String[] args) {
        int intVal =128;
        // byte byteval = intVal; 이건 에러가 뜬다 바이트라는 타입에 인트 타입이기 때문에 타입이 다르다

        byte byteval = (byte)intVal;

        System.out.printf("byteVal : %d\n", byteval);

        //byte는 -128에서 127까지 담기 가능

        int intVal2 = 128;
        byte byteVal2 = (byte)intVal2;
        System.out.printf("byteVal2 ; %d\n", byteVal2);// 오버 플로우 값이 위로 넘쳐 음수 되돌아가는 현상

        int intVal3 = -129;
        byte byteVal3 = (byte)intVal3;
        System.out.printf("byteVal3 ; %d\n", byteVal3);// 언더 플로우 값이 밑으로 넘쳐 양수로 되돌아 가는 현상


    }
}
