package day13.collablestmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStmtEx03 {
    Connection conn = null;
    CallableStatement cs = null;

    public CallableStmtEx03() throws SQLException {
        // 1. connection 얻어오기
        conn =  DBUtil.getConnection();
        // 2. CallableStatement 객체를 이용하여 호출할 프로시저 연결
        cs = conn.prepareCall("{call SP_MEMBER_INSERT(?,?,?,?,?)}");  // ? : cDATA ?: cTname
        // 3. 바인드 변수에 값을 셋팅  inprarmenter (?) 에 값 넣기

        cs.setString(1,"TB_MEMBER");
        cs.setString(2,"asd");
        cs.setString(3,"asd");
        cs.setString(4,"asd");
        cs.setString(5,"asd");

        // 4. 쿼리 수행
        // flag 의 값은 resultSet 객체의 경우는 true, 갱신카운트 또는 결과가 없는 flase 리턴 됨
        boolean flag = cs.execute();
        System.out.println(flag);

        if(cs != null) cs.close();
        if(conn != null) conn.close();

    }

    public static void main(String[] args) throws SQLException {
        new CallableStmtEx03();
    }


}




















