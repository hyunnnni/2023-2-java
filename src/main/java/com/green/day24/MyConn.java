package com.green.day24;

import java.sql.*;
// 이 주소값을 다 적어야 한다

public class MyConn {
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/board_ver1";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "green502";

    public static Connection getConn(){
        Connection conn = null;//Connection은 interface다
        try {
            Class.forName("org.mariadb.jdbc.Driver");// 대문자를 보면 패키지이다
            conn = DriverManager.getConnection(DB_URL, DB_USER,DB_PASSWORD);
            //구현부가 없는 추상클래스인데 여기에 주소값을 넣는다는 것은
            //Connection을 상속받는(implements) class가 있다는 뜻이다
            //그 class에는 mariadb
            // 리턴타입이 Connection, 그리고 static
        } catch (Exception e) {
            System.out.println("에러");
            e.printStackTrace();
        }
        System.out.println("성공");
        return conn;
    }

    public static void close(Connection conn, PreparedStatement ps){
        if(ps != null){
            try {
                ps.close(); //throw인 상태라서 오류를 try/catch로 잡아준다
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn != null){//하나가 예외가 발생 시 다른 하나의 예외를 잡을 수가 없어
            //오류를 잡을때는 각각 따로 잡아야한다
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    public static void close(Connection conn, PreparedStatement ps, ResultSet rs){
        if(rs != null){
            try{
                rs.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
       close(conn, ps);
    }
}
