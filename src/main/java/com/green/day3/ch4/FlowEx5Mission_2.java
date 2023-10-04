package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Mission_2 {
    public static void main(String[] args){
        //남자의 평균키는 170, 여자의 평균키 157


        Scanner scan = new Scanner(System.in); // 두 가지 이상을 입력받을 때 scanner 객체생성은 하나만 해줘도 된다
        System.out.println("성별을 입력해주세요 (남자or여자) > ");

        String s = scan.nextLine();

        System.out.println("키를 입력해주세요 > ");
        String t = scan.nextLine();
        int height = Integer.parseInt(t);

        if ( "남자".equals(s) ) {//남자
            if (height > 170) {
                System.out.printf("%dcm는 남자 평균 초과입니다", height);
            }else if (height <170 ) {
                System.out.printf("%dcm는 남자 평균 미만입니다", height);
            }else {
                System.out.printf("%dcm는 남자 평균 평균입니다", height);
            }
        } else { //여자
            if (height > 157) {
                System.out.printf("%dcm는 여자 평균 초과입니다", height);
            } else if (height < 157) {
                System.out.printf("%dcm는 여자 평균 미만입니다", height);
            } else {
                System.out.printf("%dcm는 여자 평균 평균입니다", height);
            }
        }
    }
}
