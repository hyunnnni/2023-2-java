package com.green.day13.ch6;

import java.io.PrintStream;
import java.sql.SQLOutput;

public class MyMath2Test {
    public static void main(String[] args) {
        MyMath2.staticNum = 1;// 클래스 메소드는 이렇게 사용하는 것 아래처럼 사용하는 경우는 거의 없다
        //static만 클래스 이름. 변수 이렇게 사용할 수 있다 클래스 이름은 대문자로 시작하니깐 이건 static변수이다
        //아래처럼 접근하나 위에 처럼 접근하나 어찌됐든 공간은 하나다
        //객체생성을 여러번 해도 복사가 되는 게 아닌 원본이 계속 변경이 된다는 뜻
        //메소드는 = 못한다. 결과에 1을 담겠다는 건 말이 되지 않는다
        //.this사용못함 공간이 다르기 때문
        MyMath2 mm2 = new MyMath2();
        mm2.num = 10;
        mm2.staticNum  =30;
        System.out.printf("mm2.num =%d, staticNum = %d\n", mm2.num , mm2.staticNum );

        MyMath2 mm2_2 = new MyMath2();
        mm2_2.num = 100;
        mm2_2.staticNum  =50;
        System.out.printf("mm2_2.num =%d, staticNum = %d\n", mm2_2.num , mm2_2.staticNum );
        System.out.printf("mm2.num =%d, staticNum = %d\n", mm2.num , mm2.staticNum ); //staticNum값이 달라진다


        System.out.printf("MyMath2.staticNum = %d\n", MyMath2.staticNum);

        PrintStream ps = System.out;//static 멤버필드 ()가 없으면 메소드가 아니다.
        ps.println("");
        //sout을 풀어쓴 것
    }
}
