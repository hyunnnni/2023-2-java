package com.green.day7.ch4;

public class A_FlowEx29 {
    public static void main(String[] args){
        // 369 게임

       /* for(int i = 1; i < 101; i++){
            System.out.printf("i = %d", i);

            if(i == 3){
                System.out.print("짝");
            }else if(i == 6){
                System.out.print("짝");
            }else if(i == 9){
                System.out.print("짝");
            }

            int num = i%10;

            if(num == 3){
                System.out.print("짝");
            }else if(num == 6){
                System.out.print("짝");
            }else if(num == 9){
                System.out.print("짝");
            }

            int num2 = i/10;

            if(num2 == 3){
                System.out.print("짝");
            }else if(num2 == 6){
                System.out.print("짝");
            }else if(num2 == 9){
                System.out.print("짝");
            }
            System.out.println();
        }
        100자리 수 밖에 쓸 수 없는 코드
*/

        for(int i = 1; i<101; i++){ // 무슨 수를 넣어도 그만큼 적용된다
            System.out.printf("i=%d",i);
            int temp = i;
            while(temp>0){
                int modVal = temp %10;
                if(modVal != 0 && modVal % 3 == 0);{ //2개가 전부 true가 뜨면 짝이 나온다 몫이 0이 나올 때까지
                System.out.print("짝");
                }
                temp /= 10;
            }
            System.out.println();
        }

       /* for(int i = 1; i<101; i++) {
            System.out.printf("i=%d", i);

            int tmp = i;
            do {
                if (tmp % 10 % 3 == 0 && tmp % 10 != 0) { //tmp%10이 두 번 사용됨으로서 위의 코드가 더 유용함 가독성이 떨어짐
                //tmp % 10 하나가 modval로 바뀐 것 위의 코드와 같음
                    System.out.print("짝");
                }
            }while ((tmp /= 10) != 0);
                System.out.println();
            }*/
        }
    }
