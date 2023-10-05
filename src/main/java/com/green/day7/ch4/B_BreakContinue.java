package com.green.day7.ch4;

public class B_BreakContinue {
    public static void main(String[] args){//p.175
        //break를 사용할 수 있는 곳 : switch, 반복문

        //continue를 사용할 수 있는 곳 : 반복문

        for (int i = 0; i<10; i++){
            System.out.println(i);//9까지 출력될텐데 break를 만났기 때문에 0만 찍히고 반복문을 빠져나온다
            break;
        }

        for (int i = 0; i<10; i++){// 그래서 주로 if(분기문)이 사용될 때 같이 사용됨
            System.out.println(i);
            if ( i == 5 ) { break; }
        }

        for (int i = 0; i<10; i++){
            System.out.println(i);
            continue; //continue 밑의 코드가 한 번 실행이 안 되었으면 한다일 때 사용 skip해서 위로 간다
            //System.out.println(i * i);
        }
        for (int i = 0; i<10; i++){
            if(i % 2 == 0) { continue;} //continue 아래에 어떤 코드가 있을 경우에만 의미가 있다
            System.out.println(i);
        }
    }
}
