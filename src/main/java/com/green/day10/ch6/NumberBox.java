package com.green.day10.ch6;

public class NumberBox {
    void sum(int n1, int n2){
        System.out.printf("%d + %d = %d\n", n1, n2, (n1+n2));//메소드를 정의한 부분
        //이게 실행이 된 후 메인메소드 실행으로 다시 리턴이 된다 (자동으로 돌아감)
        //하지만 리턴메소드를 사용할 때는 리턴을 생략하면 안된다
        return;
    }
    void minus(int n1, int n2){
        System.out.printf("%d - %d = %d\n", n1 , n2, (n1-n2)); //minus라는 메소드 정의
    }
    void abs(int n1){
        System.out.println(n1 < 0 ? -n1 : n1);
       /* if(n1<0){
            n1 *=-1;
        }
        System.out.println(n1);*/
    }
}
