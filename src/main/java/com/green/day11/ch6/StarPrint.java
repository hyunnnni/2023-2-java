package com.green.day11.ch6;

import com.green.day4.ch4.D_CharAt;

public class StarPrint {

  void line (int n) {
      for (int i = 0; i < n; i++) {
          System.out.print("*");
      }
      System.out.println();
  }
      void square (int n){
          for(int i = 0; i<n; i++){
              line(n); //메소드에서 메소드를 호출하는 게 가능하다
              //같은 공간에 있기 때문에 line 앞에 .이 생략되어있다 (this.)
              //this.도 있고 this()도 있다 메소드와 멤버필드 호출 this에 자기 자신의 주소값이 생략된 것
              //this ()는 생성자를 호출할 때 사용
          }
      }

      void triangle(int n){
        for(int i = 1; i<= n; i++){
            line(i);
        }
      }

      String chkGenderById(String n){
       char num = n.charAt(7);

       switch (num){
           case '2','4' :
               return "여성";
           case '1','3' :
               return "남성";
       }
       return "유효하지않는 주민번호";
      }

      //Charater.getNumericValue : char였던 값을 int형으로 바꿔줌
    //String.valueOf() : char을 String으로 바꿔줌

    int sumFromTo(int n1, int n2){
      int total = 0;
      for(int i = n1; i<=n2; i++){
          total += i;
      }
      return total;
    }
}
