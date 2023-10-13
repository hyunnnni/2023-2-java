package com.green.day12.ch6;

public class MethodExam3 {

    int sumTest(String str){//문자열이라 문자가 배열로 저장이 된다
        int sum = 0;
        int num = Integer.parseInt(str);
        System.out.println(num);
        for(int i = 0; i< str.length() ; i++){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }

    int sumTest2(String str){
        int sum = 0;
        for(int i = 0; i< str.length() ; i++){
            char num = str.charAt(i);
            int num2 = Character.getNumericValue(num); //char을 int로 바꾼다
            //int num = Character.getNumericValue(str.charAt(i)); 로 줄일 수 있다
            sum += num2;
        }
        return sum;
    }

    int sumTest3(String str){ //이게 제일 빠르게 계산됨
        char[] charArr = str.toCharArray();//문자열이 문자로만 저장이 되면서 '1' '2' 이런 식으로 char배열에 저장된다
        int sum = 0;
        for(char ch : charArr){//그 배열을 한 방씩 순차적으로 넣는 향상된 for문을 쓰면 따로 charAt()을 안써도 %을 안써도 한 자리씩 빼서 더할 수 있다
           sum += Character.getNumericValue(ch); //char을 int로 바꾼다
        }
        return sum;
    }

    public static void main(String[] args) { //이 메소드는 아예 다른 메모리에 올라가는 거라서 같은 클래스 안에서 써도 괜찮다
        MethodExam3 test = new MethodExam3();//객체생성 메모리에 올린다 자바는 클래스 단위로만 객체화가 가능하다
        int sum = test.sumTest3("123123");
        System.out.println("sum : "+ sum);
        System.out.println("sum2 : " + test.sumTest3("111"));
    }
}
