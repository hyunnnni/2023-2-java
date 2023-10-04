package com.green.day2.Ch3;

public class OperatorEx19 {
    public static void main(String[] args){
        int x = 10, y = 8;
        System.out.printf("%d을 %d로 나누면\n" , x, y);
        System.out.printf("몫은 %d이고, 나머지는 %d입니다.\n", x  /y, x % y);

        // /는 나누기 %는 나눴을 때 나머지
        // 값을 보며 홀짝 구분가능

        System.out.println(3 % 2);
        System.out.println(4 % 2);
        System.out.println(5 % 2);
        System.out.println(6 % 2);
    }
}
