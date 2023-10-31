package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;

//Data access object 모든 테이블과 맞을 수 있는 객체
public class BoardDao {
    public static int insboard(BoardEntity entity){ //title, ctnts, writer
       int result = 0;
       String sql = /*String.format(*/"INSERT INTO board (title, ctnts, writer) "+
                       "values" + "(?,?,?)"; //자동으로 적어준다

                       /*"('%s','%s','%s')"
               , entity.getTitle(), entity.getCtnts(), entity.getWriter());*/


       try{
           Connection con = MyConn.getConn();
           PreparedStatement ps =con.prepareStatement(sql);
           ps.setString(1,entity.getTitle());
           ps.setString(2,entity.getCtnts());
           ps.setString(3,entity.getWriter()); //??? 각 자리에 값을 넣어준다
           result = ps.executeUpdate();//영향받은 행수
       }catch (Exception e){
           e.printStackTrace();
       }finally{

       }
       return result;
    }
}
