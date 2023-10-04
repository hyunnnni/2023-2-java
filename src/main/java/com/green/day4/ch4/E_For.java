package com.green.day4.ch4;

public class E_For {
    public static void main(String[] args){
        // 반복문 () 괄호 안 3가지 항이 있다
        // 첫 번째: 초기화공간, 두 번째: 반복여부 체크, 세 번째: 증감식

        for( int i = 0 ; i<5 ; i++ ) {
            System.out.println("안녕");
        }

            //가장 먼저 실행되는 곳은 첫 번째 초기화 공간 → 두 번째 반복여부 체크 → sout 출력 → 세 번째 증감식
            //한 번 돌아가면 다시 두 번째 항인 반복여부 체크로 가고 그대로 4번 더 실행 총 5번  0 1 2 3 4

        int j = 0;
        for( ;j<10 ; ){
            System.out.println("j : " + j++); //++이 앞에 오면 1부터 표시가 되고 뒤에 오면 0부터 표시 연산이 순서대로 되기 때문
        }
    }
}
