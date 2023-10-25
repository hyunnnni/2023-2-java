package com.green.day19.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        int num = 0;

        try{//예외가 발생할 거 같다할 때의 부분
            num = 10;
            num = num/0; //0으로 나눈다고 하면 에러를 터트린다
            //try로 감싼 부분은 예외가 발생되면 catch로 잡을 수 있다
            //만약 num/0을 바깥에 적었다면 그냥 에러가 터지고 다 실행되지 않는다
        }catch (Exception e){//try에서 예외가 발생이 되었을 때 쓰는 부분 예외가 발생 안되면 지나감
            //예외가 발생하면 Exception이란 클래스에 에러정보를 넣는다 그럼 그 에러를 불러오는게 ( )
            //Exception의 주소값을 담을 수 있는 e
            e.printStackTrace();//에러 메세지를 콘솔에 띄우는 메소드
            System.out.println("예외발생");
            num = -1;
        }finally{//있어도 되고 없어도 되는 옵션 예외가 발생 되든 안되든 !반드시! 실행된다
            System.out.println("finally 실행");
        }
        System.out.printf("num : %d\n", num);
        System.out.println("----끝-----");
    }
}

class ExceptionEx1_2{
    public static void main(String[] args) {

    }

    public static void div(int num){

        try{
            num = 10;
            return;//finally 실행을 하고 돌아간다
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("예외발생");
            num = -1;
        }finally{//그 앞에 리턴을 만나거나 다른 상황이 생겨도 finally는 무조건 실행이 되고 이 try를 빠져나간다.
            System.out.println("finally 실행");
        }
        System.out.printf("num : %d\n", num);
        System.out.println("----끝-----");
    }
}

class ExceptionEx1_3{
    public void sum(){

    }
    public static void main(String[] args) {
        try{
            int num = 10/0;
            ExceptionEx1_3 obj = null;
            obj.sum();
            int[] arr = new int[10];
            arr[10] = 10;

        }catch (ArithmeticException  | ArrayIndexOutOfBoundsException e){//여러 개 할 수 있다.
            //or 연산자같은 것
            System.out.println("수학적 예외");
        }catch (NullPointerException e){
            System.out.println("null포인트 예외");
        }catch (Exception e){//모든 예외를 다 잡아 버리니 가장 마지막에 있어야 한다. Exception의 최상위객체
            //다른 Arith랑 Null의 부모는 Exception이다 상속관계
            System.out.println("모든 예외");
        }
        System.out.println("끝");
    }
}
