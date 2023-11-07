package com.green.day29.normal;

public class SamsungTv {
    private AppleSpeaker aSpeaker;
    private HarmanSpeaker hmSpeaker;
    private boolean isMute;

    public SamsungTv(){
        aSpeaker = new AppleSpeaker();
        hmSpeaker =new HarmanSpeaker();

    }

    public void sound(){
        if(!isMute){
            //aSpeaker.sound(); 스피커를 계속 바꾸고 싶을 때 여기서 계속 수정을 직접해줘야한다
            hmSpeaker.speak();
        }
    }

    public void toggleMute(){
        isMute = !isMute;
    }
}
