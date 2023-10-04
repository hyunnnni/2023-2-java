package com.green.day2.Ch3;

public class OperatorEx23 {
    public static void main(String [] args) {
        String s1 = "Hello", s2 =  "Hello";
        String s3 = new String("Hello"); //new를 쓰는 순간 새로운 주소값이 부여가 됨(객체생성)으로 s1, s2는 s3과 다르다

        System.out.printf("%s == %s : %b\n", s1, s2, s1 == s2);
        System.out.printf("%s == %s : %b\n", s1, s3, s1 == s3);
        System.out.printf("%s.equals(%s) : %b\n", s1, s3, s1.equals(s3));
        System.out.printf("%s.equals(%s) : %b\n", s3, s1, s3.equals(s1));

        //문자열 비교는 equals이퀄스를 써야한다 ==은 사용 X 동등성을 물어봄
        //reference type에서 == 비교는 주소값 비교 같은 객체인지 동일성을 물어봄


    }
}
