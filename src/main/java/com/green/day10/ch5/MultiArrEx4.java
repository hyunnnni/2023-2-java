package com.green.day10.ch5;

import java.util.Scanner;

public class MultiArrEx4 {
    public static void main(String[] args){
        //영어의 뜻은? 문제를 맞히는 퀴즈를 내라

        String[][] words = {
                {"chair", "의자"}
                ,{"computer","컴퓨터"}
                ,{"integer","정수"}
        };

        Scanner scan = new Scanner(System.in);
        //내가 한 거
        for(int i = 0; i<words.length; i++){
            for(int z = 1; z<words[i].length; z++) {
                System.out.printf("Q%d. %s의 뜻은?",i + 1 , words[i][z-1]);
                String quiz = scan.nextLine();
                if(words[i][z].equals(quiz) ){
                    System.out.println("정답입니다");
                }else{
                    System.out.printf("틀렸습니다. 정답은 %s입니다\n", words[i][z]);
                }
            }
        }

        //선생님이 한 거
        for(int i = 0; i<words.length; i++) {
            String[] wordArr = words[i];
            System.out.printf("Q%d. %s의 뜻은?", i + 1, wordArr[0]);
            String quiz = scan.nextLine();
            String exAnswer = wordArr[1];

            if(!quiz.equals(exAnswer)){
                System.out.printf("오답입니다. 정답은 %s입니다.\n" ,exAnswer);
                continue;
            }System.out.println("정답입니다");
        }

        // 향상된 for문

        int i =1;

        for(String[] wordArr : words) {

            System.out.printf("Q%d. %s의 뜻은?", i + 1, wordArr[0]);
            String quiz = scan.nextLine();
            String exAnswer = wordArr[1];

            if(!quiz.equals(exAnswer)){
                System.out.printf("오답입니다. 정답은 %s입니다.\n" ,exAnswer);
                continue;
            }System.out.println("정답입니다");
        }

    }
}
