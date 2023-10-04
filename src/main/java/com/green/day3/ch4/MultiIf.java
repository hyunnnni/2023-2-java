package com.green.day3.ch4;

public class MultiIf {
    public static void main(String[] args) {
        int num = 30;

        if(num >= 50) {

            if (num >= 80) {
                System.out.printf("%d 엄청 엄청 엄청 크다!", num);
            } else {
                System.out.printf("%d는 엄청 엄청 크다!", num);
            }
        } else {
            if (num >= 40 ) {
                System.out.printf("%d는 엄청 크다", num);
            } else{
                System.out.printf("%d는 좀 크다!", num);
            }
        }

        //if문 안에 if문 몇 번을 들어가도 상관없다 중첩if문 그러나 최대한 탭이 없게 짜는게 좋다
        //if문은 시작할 때 무조건 if로만 시작
    }
}
