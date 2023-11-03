package com.green.day27;

public class SubstringTest {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJK";

        String r1 = str.substring(2,4); //2번째부터 4번째까지
        System.out.println("r1 : "+ r1);

        System.out.println("r2 : "+ str.substring(4)); //4번째 부터 끝까지 나오게 한다

        System.out.println(str);
    }
}
