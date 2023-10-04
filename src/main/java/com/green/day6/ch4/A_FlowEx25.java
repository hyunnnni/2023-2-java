package com.green.day6.ch4;

import java.util.Scanner;

public class A_FlowEx25 {
    public static void main(String[] args){
        int num = 0, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 (예 : 12345) >>");

        String input = scan.nextLine();
/*        num = Integer.parseInt(input);

        while( num > 0){
            sum += num %10; //sum = sum + num %10;
            num /= 10;
            *//*int modVal = num%10; 10을 나누기 하면 끝자리 수가 나머지로 남는다
            num = num / 10; 몫을 num에 넣어준다

            sum += modVal;

            처음에 나머지 5가 sum에 대입되고 몫 1234은 num에 대입
            두 번째에서 나머지 4가 sum(5)+4가 sum에 대입되고 몫 123은 num에 대입 그 후 반복
*//*
        }
        System.out.println("결과 >> " +sum);*/

        char[] arr = input.toCharArray();
        for(int i = 0; i<arr.length; i++){
            sum += Character.getNumericValue(arr[i]);//char을 아스키코드가 아닌 정수형 그대로 인식해서 가져오는 메소드
        }
        System.out.println("결과 : " + sum);
        //배열과 for문을 사용하면 문자열로 인식해서 하나씩 가져오는 게 가능
    }
}
