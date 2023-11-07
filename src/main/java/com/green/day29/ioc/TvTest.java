package com.green.day29.ioc;

public class TvTest {
    public static void main(String[] args) {
        /*String strTv = "lg";
        String strSpeaker = "apple";
        String strWoofer = "hansung";*/
        String strTv = args[0];
        String strSpeaker = args[1];
        String strWoofer = args[2]; // 왼쪽 위 실행버튼 옆 아래 화살표 프로그램 아규먼트에 값을 보내서 원하는 값을 보낼 수 있다
        Tv tv = TvFactory.instance(strTv, strSpeaker,strWoofer);
        tv.sound();
        tv.toggleMute();
        tv.sound();

        // 이렇게 하면 원래 있던 메소드나 다른 거의 수정없이 원하는 값으로 바꿀 수 있다
        // 이걸 ioc라고 한다
        // 이때까지는 직접적 연결이라서 수정하기 어려웠다면 인터페이스를 사용해서 느슨하게 연결해
        // 수정이 용이하게 한 방법이다
    }
}
