package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest4 {
    public static void main(String[] args) {// 이메일 받기
        String str1 = "abc@anver.com";
        String str2 = "abc@naver.co.kr";
        String str3 = "abc@naver.co.k";
        String str4 = "rㄱc@naver.com";
        String str5 = "111@na.co.kr";
        String regexp = "^[a-z|A-z|0-9]+@([a-z|A-z|0-9]{3,}\\.[a-z]{2,}+|" +
                "[a-z|A-z|0-9]{3,}\\.[a-z]{2,}\\.[a-z]{2,}+)$";
        //[영어와 숫자 아무거나 한글자 또는 많이] 골뱅이필수[영어와 숫자 아무거나 3글자 이상] .필수[영어 소문자 두 글자 이상]
        //or [영어와 숫자 아무거나 3글자 이상] .필수[영어 소문자 두 글자 이상].필수[영어 소문자 두 글자 이상]
        //라는 뜻

        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str1));
        System.out.printf("%s > %b\n", str2, Pattern.matches(regexp, str2));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp, str3));
        System.out.printf("%s > %b\n", str4, Pattern.matches(regexp, str4));
        System.out.printf("%s > %b\n", str5, Pattern.matches(regexp, str5));
    }
}
