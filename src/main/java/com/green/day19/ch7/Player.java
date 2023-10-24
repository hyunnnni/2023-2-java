package com.green.day19.ch7;


class PlayerTest{
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play(10);
        VideoPlayer vp = new VideoPlayer();
        vp.play(20);
        Player player = ap;//부모 클래스라서 자식 클래스의 주소값을 넣을 수 있고
        player.play(30);//부모도 이 메소드를 가지고 있으니 호출할 수 있다 호출해 오는 건 객체 기준 ap
        Player player2 = vp;
        player.play(40);
    }
}
public abstract class Player {//추상메소드
    public abstract void play(int pos);
    //추상메소드는 abstract라는 키워드를 써야한다. 그때 클래스 앞에도 붙여야 한다
    //클래스는 자기가 가진 메소드 중 단 하나라도 추상 메소드가 있으면 자신도 추상클래스가 되어야 한다.
    //추상 메소드가 없어도 추상 클래스는 될 수 있다 이유는 객체화가 안되게 막으려는 이유가 있다
    //추상 메소드는 구현부가 없다 선언부만 있고 끝은 ;으로 끝낸다
    //구현부 내용이 없기 때문에 객체 생성이 안된다.
    //객체화가 안되기 때문에 부모로만 활동하겠다는 뜻이다.
    //강제성을 가진다 부모 클래스에 추상 메소드가 있다면
    //상속관계인 자식 클래스가 생기면 그 자식 클래스에서 꼭 오버라이딩을 하라는 강제성이 있다.
    //추상 메소드는 없고 클래스만 추상 클래스라면 오버라이딩을 하라는 강제성은 없다.

}

class AudioPlayer extends Player {


    @Override
    public void play(int pos){
        System.out.println("Audio Play 위치 : " +pos);
    }

}

class VideoPlayer extends Player{
    @Override
    public void play (int pos){
        System.out.println("video play 위치 : "+pos);
    }
}

abstract class DvdPlayer extends Player{//오버라이딩을 하지 않으려면 똑같이 추상메소드로 적으면 된다
    //미루는 느낌

}
