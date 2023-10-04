package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2_4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 하나 입력하세요 > ");

        String input = scan.nextLine();
        int num = Integer.parseInt(input);

        if ( num == 0 ) {
            System.out.println( "이 값은 0입니다. 다른 값을 입력해주세요");
        } else {
            System.out.printf("%d 은/는 %s수입니다." , num , (num % 2 == 0 ? "짝":"홀"));
        }
        //조건식 ? 앞에 식이 true였다면 앞의 "짝"이 찍혀서 나오고 false였다면 뒤의 "홀"이 찍혀서 나옴
        //이런 식으로 중복되지 않게 적으면 좋다 삼항식 사용하기~

    }

}
