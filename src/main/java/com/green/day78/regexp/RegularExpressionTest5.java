package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest5{
    public static void main(String[] args) {// 이메일 받기
        //전화번호 허용 010, 011, 016, 018, 019
        String str6 = "010-123";
        String str7 = "011-1234";
        String str8 = "012";
        String str9 = "015";
        String str10 = "017-1234-1234";
        String regexp1 = "^01[0-1|6-9]{1}-[\\d]{3,4}-[\\d]{4}$";

        System.out.println("-------------------------------");
        System.out.printf("%s > %b\n", str6, Pattern.matches(regexp1, str6));
        System.out.printf("%s > %b\n", str7, Pattern.matches(regexp1, str7));
        System.out.printf("%s > %b\n", str8, Pattern.matches(regexp1, str8));
        System.out.printf("%s > %b\n", str9, Pattern.matches(regexp1, str9));
        System.out.printf("%s > %b\n", str10, Pattern.matches(regexp1, str10));


    }
}
