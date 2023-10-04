package com.green.day4.ch4;

public class C_RandomVal {
    public static void main(String[] args){
        double doubleVal = Math.random();//랜덤으로 0.000~0.9999---의 수가 대입된다 절대 1이 안 나온다
        System.out.println("doubleval : " + doubleVal);

        int intVal = (int)(doubleVal*10);//doubleval*10의 연산이 먼저 끝나고 int로 바꿔야 함
        //()없이 그냥 강제형변환하면 double만 int로 바뀌면서 소수점이 날아가고 0만 남게됨 그래서 값이 0만 나옴
        // 이 연산에서 최소값은 0 최대값은 9
        System.out.println("intVal : "+ intVal);

        int rVal = (int)(Math.random()* 20);
        System.out.println("rVal : " + rVal);
        //절대 1이 나올 수 없다 최소값은 0에서 최대값 19
    }
}
