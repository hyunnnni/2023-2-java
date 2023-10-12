package com.green.day11.ch6;

import com.green.day10.ch6.MethodExam;

public class MethodExam2Test {
    public static void main(String[] args){
        MethodExam2 me2 = new MethodExam2();
        String r1 = me2.scoreResultOpt(90);

        System.out.println("점수는 " + r1);
        /*
        100초과 0 미만은 "점수를 확인해 주세요"라는 값이 리턴
        나머지는 90 이상은 A 8점이상+ 3점이하- 나머지0
        나머지는 80 이상은 B
        나머지는 70 이상은 C
        나머지는 69 이하는 D (+-0없음)
         */

        String season = me2.getSeason(6);

        System.out.println(season);
        /*
        345 > 봄
        678> 여름
        91011>가을
        1212>겨울
        나머지 없음
         */
    }
}
