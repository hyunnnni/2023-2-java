package com.green.day78.regexp;
import java.util.regex.Pattern;
public class RegularExpressionTest2 {
        public static void main(String[] args) {
            String str1 = "123";
            String str2 = "adsads";
            String str3 = "ASDASF";
            String regexp = "^[a-z|A-Z]*$";

            boolean asd = Pattern.matches(regexp,str1);
            System.out.printf("%s > %b\n",str1,Pattern.matches(regexp,str1));
            System.out.printf("%s > %b\n",str2,Pattern.matches(regexp,str2));
            System.out.printf("%s > %b\n",str3,Pattern.matches(regexp,str3));
        }
    }
