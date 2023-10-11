package com.green.day10.ch6;

public class C_MethodExamTest {
    public static void main(String[] args){
        C_MethodExam me = new C_MethodExam();
        me.checkZero(10);
        me.checkZero(9);
        me.checkZero(0); //메소드를 사용한 방식이 리턴보단 보이드에 더 가깝기 때문에 보이드 메소드 사용

        int r = me.randomValFromTo(10, 100);; //10~100 랜덤값이 리턴되도록
        System.out.printf("랜덤값 : %d\n", r);

        int r2 = me.randomValFromTo(5, 9);; //5~9 랜덤값이 리턴되도록
        System.out.printf("랜덤값 : %d\n", r2);


        me.scoreResultPrint(101); //잘못된 점수입니다
        me.scoreResultPrint(100);
        me.scoreResultPrint(90);//A학점
        me.scoreResultPrint(89);
        me.scoreResultPrint(80);//b학점
        me.scoreResultPrint(79);//c학점
        me.scoreResultPrint(69);//d학점 (이하는 다 d)
        me.scoreResultPrint(-1);//잘못된 점수
    }
}
