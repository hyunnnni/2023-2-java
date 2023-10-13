package com.green.day11.ch6;

public class MethodExam2 {

    String scoreResultOpt(int n1){
        if(n1<0 || n1>100){
            return "점수를 확인해 주세요";
        }
        String grade = "D";
        if(n1<=69 || n1 == 100){
            grade = (n1<=69 ? "D":"A+");
            return grade;
        }

        String pm = "0";
        int modVal = n1%10;

        if(n1 >= 90){
            grade = "A";
        }else if(n1 >= 80){
            grade = "B";
        }else {
            grade = "C";
        }

        if(modVal >= 8 || modVal <= 3){
            pm = (modVal>=8 ? "+":"-");
        }
        return grade+pm;
        /*String result = String.format("%s%s", grade, pm);
        return result;
        sout f로 쓰고 거기에 보내고 싶다면 이 메소드를 사용하면 된다 */
    }

    //--------------------------------------------------선생님이 하신 거
    /*String scoreResultOpt(int n1){
        if(n1<0 || n1>100){
            return "점수를 확인해 주세요";
        }

        if(n1<=69){
            return "D";
        }else if(n1 == 100){
            return "A+";
        }

        String grade = "C";

        if(n1 >= 90){
            grade = "A";
        }else if( n1 >= 80) {
            grade = "B";
        }

        String pm = "0";
        int modVal = n1 % 10;

        if(modVal >= 8){
            pm ="+";
        }else if (modVal <= 3){
            pm = "-";
        }
        return grade+pm;
    }*/

    String getSeason (int n){

        switch (n) {
            case 3,4,5 :
                return "봄";

            case 6,7,8 :
                return "여름";

            case 9,10,11 :
                return "가을";

            case 12,1,2 :
                return "겨울";
        }
        return "없음";//return은 모든 값이 다 return이 필요하기 때문에 마지막에 혹시 모를 다른 경우를 위해 return 해줘야 한다.
    }
}
