package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest3 {
    public static void main(String[] args) {
        String str1 = "하12";
        String str2 = "하123";
        String str3 = "히히ㄱ1111";
        String str4 = "111 1";
        String str5 = "11ㅣ11";
        String regexp = "^([ㄱ-ㅎ|ㅏ-ㅣ|가-힣|0-9 ]+[0-9]*)";//+는 한글자 또는 많이 *은 0또는 많이
        //띄어쓰기도 가능

        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str1));
        System.out.printf("%s > %b\n", str2, Pattern.matches(regexp, str2));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp, str3));
        System.out.printf("%s > %b\n", str4, Pattern.matches(regexp, str4));
        System.out.printf("%s > %b\n", str5, Pattern.matches(regexp, str5));
    }
}
