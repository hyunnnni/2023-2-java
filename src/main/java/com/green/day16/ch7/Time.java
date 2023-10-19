package com.green.day16.ch7;

public class Time {
    public final static int MAX = 23;
    public final static int MIN = 0;
    private int hour, minute, second;
    //이제 앞으로 멤버필드는 private줘야한다 은닉화 그래야 외부에서 접근해 변경하는 걸 막을 수 있기때문

    //1.생성자
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //2.setter 메소드 속성마다 하나 씩 다 적어야한다.
    //이름은 set하고 원하는 멤버필드이름을 적는데 첫글자는 대문자로 적기
    //오른쪽 키 - Generate - setter 을 누르면 이런 메소드를 자동으로 적어준다
    //저번 constructor 자동으로 생성자에서 멤버필드에 받은 파라미터값을 넣어줬던 것과 비슷
    public void setHour(final int hour) {
        if(hour>MAX){
            this.hour = MAX;
        }else if (hour<MIN){
            this.hour = MIN;
        }else {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString(){
        //String strHour = String.valueOf( 삼항식 ) 사용해도 되는데 별로 안좋음
        return String.format("%02d시 %02d분 %02d초", hour, minute, second);
        //.1f랑 같은 개념~ 여기서 2는 2칸정도의 공간을 만들겠다는 뜻이고 나머지 숫자가 들어오지 않는 빈공간 0으로 채운다라는 뜻
        //그냥 2만 적으면 두 자리만 차지한다
        //static메소드 클래스 이름. 메소드 명  구분 잘하자 객체화 없이 사용
    }


}

class TimeTest{
    public static void main(String[] args) {
        Time time = new Time(10, 20, 30);
        //time.hour =10; private이 있어서 이렇게 사용이 안됨
        System.out.println(time);
        time.setHour(2);

        System.out.println(time);



    }
}
