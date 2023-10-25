package com.green.day20.ch8;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try{
            Exception e = new Exception();
            throw e;//throw를 쓰면 에러로 던져진다
        }catch (Exception e){
            System.out.println(e.getMessage());//
            e.printStackTrace();//에러내용을 콘솔에 찍는 거
        }
        System.out.println("----- 끝 -----");
    }
}
