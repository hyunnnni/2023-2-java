package com.green.day4.ch4;

public class D_CharAt {
    public static void main(String[] args) {
        String str = "abcdefghijk".toUpperCase(); //대문자로 올려주는 메소드기능 여기서 .은 기능을 실행시키는 역할, 원본 유지 비파괴

        char result = str.charAt(1);
        //charAt()이건 자릿값을 찾아서 표시해주는 메소드 ()은 원하는 배열 수를 넣어주기
        //배열은 0 부터 시작이므로 A = 0 ,B = 1....
        System.out.println("result : " +result);
        System.out.println("result : " + str.charAt(2));

        //보통은 문자열 자르기를 사용하므로 잘 사용안함
    }
}
