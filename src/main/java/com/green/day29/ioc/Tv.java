package com.green.day29.ioc;

public abstract class Tv {
    protected boolean isMute;
    protected Speaker speaker;


    public void toggleMute(){
        isMute = !isMute;
    }

    public void sound(){
        if(!isMute){
            speaker.sound();
        }
    }
}
