package com.green.day10.ch6;

public class ReturnNumberBoxTest {
    public static void main(String[] args){
        ReturnNumberBox rnb = new ReturnNumberBox();
        //rnb.sum(10,20); 이렇게 사용하지 않고 결과값만 리턴 되어서 오기에 밑처럼 값을 넣어줘야한다 메소드에서 선언한 타입도 맞춰야 함
        //void라면 무조건 위처럼 적어야 됨
        int r1 = rnb.sum(10,20);
        //리턴에서 복사 되어 위의 rnd.sum은 30이 되어 돌아온거다
        //이렇게 적힌 경우는 무조건 리턴 메소드
        System.out.println("r1 : " + r1);
        int r2 = rnb.sum(30,40);
        System.out.println("r2 : " + r2);
        System.out.println("--끝--");

        int r3 = rnb.abs(-10);
        System.out.println("r3 : " +r3); //10

        System.out.println("r4 : "+rnb.abs(10));
        System.out.println("r5 : "+rnb.abs(-99));
        System.out.println("r6 : "+rnb.abs(98));
    }
}
