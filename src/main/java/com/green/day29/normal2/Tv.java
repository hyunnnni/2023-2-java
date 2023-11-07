package com.green.day29.normal2;

public abstract class Tv {
    protected boolean isMute;
    protected Speaker speaker;// interface를 사용함으로써 이 곳을 normal처럼 수정했어야한다
    //부모가 같기 때문에 부모의 이름으로 두 개의 클래스 값을 담아 둘 다 사용할 수 있게 한 것


    public void toggleMute(){
        isMute = !isMute;
    }

    public void sound(){
        if(!isMute){
            speaker.sound();
        }
    }
}
