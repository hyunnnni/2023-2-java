package com.green.day2.Ch2;

public class Printf {
    public static void main(String[] args) {
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("----------");
        System.out.print("halo\n"); //이스케이프 역슬러쉬(원화)n을 하면 엔터가 됨
        System.out.print("halo");
        System.out.print("halo\n");

        String name = "홍길동";
        int age = 23;
        char bloodtype = 'B';
        float height = 178.8f;

        // 제 이름은 홍길동이고, 나이는 23세이고 혈액형은 B형이고 키는 178.8cm입니다.

        System.out.print("제 이름은 " + name + "이고, ");
        System.out.print("나이는 " + age + "이고, ");
        System.out.print("혈액형은 " + bloodtype + "형이고, ");
        System.out.println("키는 " + height + "cm 입니다. ");

        //%가 값을 주입할 포인트
        //포인트를 적고 후에 , 쓰고 순서대로 주입할 변수를 나열
        //s = string, d = int(d는 정수라는 뜻 short, long, byte), c = char, f = 실수 (float,double) b = boolean
        // "나이는%3d세이고" 라고 적으면 띄어쓰기를 쓰지 않아도 3칸을 차지해서 나옴 = 나이는 23세이고
        //"키는 %.1fcm입니다." 라고 적으면 소수점 뒤로 한 자리 수만 표시됨 .3일 경우 3자리 날아가진 않고 표시될 때만 안 보이게 표시

        System.out.printf("제 이름은 %s이고, 나이는 %d세이고, 혈액형은 %c형이고, 키는 %fcm입니다."
        , name, age, bloodtype,height);

    }
}
