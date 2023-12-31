package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Data access object 모든 테이블과 맞을 수 있는 객체
public class BoardDao {//insert
    public static int insboard(BoardEntity entity){ //title, ctnts, writer
       int result = 0;
      /* String sql = *//*String.format(*//*"INSERT INTO board (title, ctnts, writer) "+
                       "values" + "(?,?,?)"; */
        //업데이트 문처럼 하는 insert문
        String sql = "INSERT INTO board" + // 가독성이 더 좋다, 오라클에서 되는지는 확인 되지 않는다
                "SET title = ?" +
                ", ctnts = ?" +
                ", writer = ?";


                       /*"('%s','%s','%s')"
               , entity.getTitle(), entity.getCtnts(), entity.getWriter());*/
        Connection con=  null;
        PreparedStatement ps =null;//?에 들어가는 것
        // 문자열로 들어가면 자동으로 ''가 들어가고 아니라면 그냥 들어가게 해준다

       try{
           con = MyConn.getConn();
           ps =con.prepareStatement(sql);//? 를 사용하면 '"를 자동으로
           //적어준다.준비된 ps란 변수에 con은 준비할 값을 넣을 것이다.
           ps.setString(1,entity.getTitle());
           ps.setString(2,entity.getCtnts());
           ps.setString(3,entity.getWriter()); //??? 각 자리에 값을 넣어준다
           //인식해서 문자열로 바꿔 ''를 붙여서 각 자리에 넣어준다
           result = ps.executeUpdate();//영향받은 행수 쿼리문 실행하자
       }catch (Exception e){
           e.printStackTrace();
       }finally{

           MyConn.close(con, ps);//리소스를 너무 많이 잡아먹어서 닫아줘야한다
           //filo 스텝방식 마지막에 넣어준 걸 먼저 빼준다
       }
       return result;
    }

    public static int delBoard(BoardEntity entity){//delete
        int result =0;
        String sql = "delete from board " +
                "where iboard = ?";
        Connection con = null;
        PreparedStatement ps = null;

        try{
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);

            ps.setInt(1, entity.getIboard());
            result = ps.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyConn.close(con, ps);
        }
        return result;
    }
    public static int updBoard(BoardEntity entity){//update
        int result =0;
        String sql = "update board " +
                "set title = ?, ctnts = ?, writer = ? , updated_at = now() " +
                "where iboard = ?";
        Connection con = null;
        PreparedStatement ps = null;

        try{
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            ps.setInt(4, entity.getIboard());
            result = ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyConn.close(con, ps);
        }
        return result;
    }

    public static List<BoardEntity> selBoardList(){ //select
        //board에 있는 컬럼들의 값이 BoardEntity에 들어가니깐
        //여러 레코드들을 다 담을 수 있는게 List<BoardEntity>다.
        List<BoardEntity> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null; //셀렉을 했을 때 결과물이 담기는 것
        String sql = "select iboard, title, writer, created_at " +
                "from board";
        try{
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(); //select는 무조건 Query!

            while(rs.next()){//레코드가 있는지 1행부터 체크, 레코드가 있는 수 만큼 반복
                //레코드가 있다면 true가 되고 또 그 다음 레코드를 체크한다 그 다음 레코드가 없다면 false가 뜨면서 while문이 종료된다
                //if는 한 줄만 체크하고 싶을 때 사용
                BoardEntity entity = new BoardEntity();
                int iboard = rs.getInt("iboard");
                String title = rs.getString("title");
                String writer = rs.getString("writer");
                String createdAt = rs.getString("created_at");
                entity.setIboard(iboard);
                entity.setTitle(title);
                entity.setWriter(writer);
                entity.setCreatedAt(createdAt);
                list.add(entity);



            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyConn.close(con, ps, rs);
        }
        return list;
    }
    public static BoardEntity selBoardById(int pk){
        BoardEntity entity = new BoardEntity();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql  = "select iboard, title, ctnts, writer, created_at, updated_at " + //*을 써도 된다
                "from board where iboard = ?";

        try{
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pk);
            rs = ps.executeQuery();//읽어오는 것 가져올 수 있는 레코드의 경우의 수는 2개 1개가 넘어오거나 0개 넘어오거나

        if(rs.next()) {//없는 pk값이 들어오면 없는 레코드임에도 값이 null로 뜨면서 실행이 될 수 있으니 if나 while로 감싸준다
            //next() 맨 처음 아무 줄도 선택을 안 하고 있다가 다음 줄을 커서로 선택해주는 메소드
            entity.setIboard(pk);
            entity.setTitle(rs.getString("title"));
            entity.setWriter(rs.getString("writer"));
            entity.setCtnts(rs.getString("ctnts"));
            entity.setCreatedAt(rs.getString("created_at"));
            entity.setUpdatedAt(rs.getString("updated_at"));
            return entity;//없는 pk값이 들어올 수 도 있으니 있을 때만 실행되며 return 될 수 있게 if문 안에서 주소값을 return해준다
        }

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            MyConn.close(con, ps, rs);
        }
        return null;//없는 pk값이 들어오면 그냥 null로 리턴
    }


}


