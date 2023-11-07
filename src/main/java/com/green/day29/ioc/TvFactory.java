package com.green.day29.ioc;

public class TvFactory {
    public static Tv instance(String strTv, String strSpeaker, String strWoofer) {
        //
        Woofer woofer = null;
        switch (strWoofer) {//파라미터로 받은 값이 둘 중 하나일 때 null로 둔 주소값에 해당 woofer의 주소값을 받겠다
            case "hanil":
                woofer = new Hanilwoofer();
                break;
            case "hansung":
                woofer = new Hansungwoofer();
                break;
        }
        Speaker speaker = null;
        switch (strSpeaker) { // woofer의 주소값을 또 해당되는 speaker의 값에 따라 둘 중 한 곳의 생성자에 파라미터로 보내진다
            // 그럼 speaker의 멤버필드에 한일 한성 둘 중 하나의 주소값이 들어가서 어떤 woofer를 사용하는지 정해진다
            case "apple":
                speaker = new AppleSpeaker(woofer);
                break;
            case "harman":
                speaker = new AppleSpeaker(woofer);
                break;
        }
        Tv tv = null;
        switch (strTv) {// 정해진 woofer의 값과 원하는 소리를 내는 speaker클래스의 주소값이 해당되는 tv의 생성자로 보내지며
            //그 주소값을 리턴해준다
            case "samsung":
                tv = new SamsungTv(speaker);
                break;
            case "lg":
                tv = new Lgtv(speaker);
                break;
        }
        return tv;

    }
}
