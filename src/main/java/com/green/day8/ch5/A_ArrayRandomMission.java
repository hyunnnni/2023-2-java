package com.green.day8.ch5;

import java.util.Arrays;

public class A_ArrayRandomMission {
    public static void main(String[] args) {
        /* 5개의 방을 갖고 있는 정수형배열을 만드시고
        각방의 1~10의 랜덤한 값을 넣어주세요
        중복불가
         */

        int[] ran = new int[5];

        for (int i = 0; i < ran.length; i++) {
            int num = (int) (Math.random() * 10) + 1;
            ran[i] = num;

            for (int j = 0; j < i; j++) { //0번째 방에 대입될 때는 처음으로 찍히는 값이므로 중복이 나올 수 없으니 그냥 넘어간다
                if (ran[i] == ran[j]) {//그래서 0번방이 찍힌 후 그 다음 실행될 때 여기서 검증이 시작된다
                    i--;//이때 ex)ran[1]에 찍힌 랜덤숫자가 ran[0]에 찍혔던 랜덤숫자와 같으면 i--를 해서 break로 이 for문을 벗어나고
                    break;//위 for문으로 돌아가서 ran[1]에 랜덤 숫자를 다시 입력하도록 돌아가게 된다 -가 되면서 for문 실행 수도 늘어난다
                }
            }
        }
        for (int i = 0; i < ran.length; i++) {
            System.out.printf("ran[%d] : %d\n", i, ran[i]);
        }

        System.out.println(ran);
        System.out.println(Arrays.toString(ran)); // 배열 다 출력

        }
    }
