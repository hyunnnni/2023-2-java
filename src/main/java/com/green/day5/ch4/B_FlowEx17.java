package com.green.day5.ch4;

import java.util.Scanner;

public class B_FlowEx17 {
    public static void main(String[] args){
        //Scanner를 이용하여 정수를 입력 받는다
        //"*을 출력할 라인의 수를 입력하세요 >>"

        Scanner scan = new Scanner(System.in);
        System.out.println("*을 출력할 라인의 수를 입력하세요 >> ");

        String s = scan.nextLine();
        int star = Integer.parseInt(s);

        for (int i = 0; i < star; i++){

            for (int z = 0; z < i+1; z++){//1번 실행이 될 때 i의 값은 0 z의 값도 0 하지만 i에 +1이 되면서
                //z<i+1은 0<1이 된다 그래서 이 중첩 for은 한 번만 실행이 되어 *이 하나만 찍히고 엔터가 된다
                //다시 바깥 for문으로 돌아가 실행이 되면서(star값까지 재실행이 되니깐) i의 값은 i++가 되므로 2가 된다
                //z<i+1은 0<2가 된다 이때 이 중첩 for은 두 번 실행이 되므로 ** 이렇게 두개가 찍히고 엔터가 된다 -반복-

                System.out.print("*");

            }
            System.out.println();
        }
    }
}
