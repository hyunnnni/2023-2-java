package com.green.day3.ch4;

public class AssignmentOperators2 {
    public static void main(String[] args){
        //복합 대입 연산자 p.132
       int r1 = 0, n1 = 0, a1 = 0;
       r1 = ++n1;//1을 올린 후 읽고 복사(쓰기먼저하고 읽기) r1이랑 n1 둘 다 1
       ++a1;
       System.out.printf("r1 : %d, n1 :%d, a1 : %d\n", r1, n1, a1);

       int r2 = 0, n2 = 0, a2 = 0;
       r2 = n2++; //읽기 먼저 함 복사한 후 1을 올린다(읽기먼저하고 쓰기) n2만 1 r2에는 그대로 0만 대입
       a2++;
       System.out.printf("r2 : %d, n2 : %d, a2 : %d\n", r2, n2, a2);
    }
}
