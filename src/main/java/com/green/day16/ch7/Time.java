package com.green.day16.ch7;

public class Time {
    public final static int MAX = 23;
    public final static int MIN = 0;
    private int hour, minute, second;
    //이제 앞으로 멤버필드는 private줘야한다 은닉화 그래야 외부에서 접근해 변경하는 걸 막을 수 있기때문

    //값을 넣는 방법 2가지
    //1.생성자
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //2.setter 메소드 속성마다 하나 씩 다 적어야한다.
    //private으로 감춰진 멤버필드의 값을 변경할 때 사용
    //이후에도 값 변경 가능~ 생성자로만 값을 넣는다면 생성될 때만 구현되니깐 상수처럼 됨
    //이름은 set하고 원하는 멤버필드이름을 적는데 첫글자는 대문자로 적기
    //오른쪽 키 - Generate - setter 을 누르면 이런 메소드를 자동으로 적어준다
    //저번 constructor 자동으로 생성자에서 멤버필드에 받은 파라미터값을 넣어줬던 것과 비슷
    //값을 보낼 필요가 없으니 void로만 적으면 된다

    //값을 빼는 방법은 1가지
    //getter 메소드 private으로 감춰진 값을 가지고 와야할 때 사용한다
    //다시 보내야 할 값이 있으니 타입에 맞춰 리턴 메소드로 작성
    //private이 붙은 멤버필드가 있으면 거의 getter가 있다. 그래야 값을 빼서 쓸 수 있으니까
    public int getHour() {
        return hour;
    }//getter은 파라미터 정보가 없다 이미 이름에 그 정보가 있음

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

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
