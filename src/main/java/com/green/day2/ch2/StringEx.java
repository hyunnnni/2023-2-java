package com.green.day2.Ch2;

import java.sql.SQLOutput;

public class StringEx {
    public static void main(String[] args) {
        String name = "ja" + "va";
        System.out.println(name);

        System.out.println("ja"+"va"); // 일회용

        System.out.println("12"+ 10 + 9 ); //앞에 문자열이 있기 때문에 뒤에 오는 10과 9도 문자로 인식 (자동 형변환
        //"12" + 10 두 개는 다른 타입 (string과 int) 이 때 string이 이김
        //"12" + "10" 으로 인식 = "1210"
        //"1210" + 9 도 동일하게 인식
        //"12109"

        System.out.println("12" + (10+9));
        //()를 써주면 우선적으로 진행이 되며 덧셈연산도 진행이 됨

    }
}
