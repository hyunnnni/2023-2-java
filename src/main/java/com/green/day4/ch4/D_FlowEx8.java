package com.green.day4.ch4;

import java.util.Scanner;

public class D_FlowEx8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("당신의 주민번호를 입력하세요.(000000-1111333, 중간 하이픈 포함 작성) >> ");
        //전화번호나 주민번호 등등 번호는 정수로 받게 되면 앞에 0이 있을 경우 0이 날아가기 때문에
        //번호가 들어간 건 문자로 스캔을 받는다

        String num = scan.nextLine();
        char idGen = num.charAt(7);


        switch (idGen) {//괄호안에 들어간 값에 따라 case 타입이 달라진다 char='', String="", 정수 = 숫자 이렇게만 가능
            //실수나 논리형은 사용불가
            case '1','3' :
                System.out.println("이 주민번호의 대상자는 남자입니다.");
                break;
            case '2','4' :
                System.out.println("이 주민번호의 대상자는 여자입니다.");
                break;
            default:
                System.out.println("유효하지않은 주민등록번호입니다. 다시 입력해주세요.");
                break;
        }
    }
}
