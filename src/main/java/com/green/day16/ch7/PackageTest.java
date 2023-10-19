package com.green.day16.ch7;


import static com.green.day13.ch6.MyMath2.staticAbs; //static을 import할려면 import static을 적으면 된다
import com.green.day13.ch6.MyMath2;
import com.green.day15.ch7.Parent;//Parent 대신 *(와일드카드)을 쓰면 ch7에 있는 파일들을 전부 다 import하는 효과가 있다.


public class PackageTest {
    public static void main(String[] args) {
        Parent parent; //다른 패키지의 클래스인데 앞에 public이 있어서 데려와 쓸 수 있다.
        //이럴 경우 위에 import가 뜨면서 파일 위치가 적힌다
        //만약 import를 없애고 싶다면 com.green.day15.ch7.Parent parent;
        MyMath2.staticAbs(10); //이렇게 메소드도 호출할 수 있고 멤버필드도 호출할 수 있다
        staticAbs(10);//이렇게 메소드만 적고 싶다면 위처럼 클래스. 메소드 적어준다 이때 메소드가 static이라면 static붙여준다
    }
}
