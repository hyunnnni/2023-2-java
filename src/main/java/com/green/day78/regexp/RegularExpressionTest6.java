package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest6 {
    public static void main(String[] args) {//주민번호
        String str1 = "991209-1223456";
        String str2 = "9912031-1223456";
        String str3 = "991203-21223456";
        String str4 = "991203-2223456";
        String str5 = "001203-3456789";
        String str6 = "001203-4456789";
        String regexp1 = "^[\\d]{2}((02(0[1-9]|1[0-9]|2[0-9]))|(0[1|3-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1]))-[1-4][0-9]{6}$";

        System.out.println("-------------------------------");
        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp1, str1));
        System.out.printf("%s > %b\n", str2, Pattern.matches(regexp1, str2));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp1, str3));
        System.out.printf("%s > %b\n", str4, Pattern.matches(regexp1, str4));
        System.out.printf("%s > %b\n", str5, Pattern.matches(regexp1, str5));
        System.out.printf("%s > %b\n", str6, Pattern.matches(regexp1, str6));


    }
}
