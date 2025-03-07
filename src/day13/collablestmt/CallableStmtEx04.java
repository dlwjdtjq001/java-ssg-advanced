package day13.collablestmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStmtEx04 {
    CallableStmtEx04() throws SQLException {
        Connection conn =  DBUtil.getConnection();
        CallableStatement cs = conn.prepareCall("{call SP_MEMBER_LIST(?)}");
        cs.setString(1,"TB_MEMBER");

        ResultSet rs = cs.executeQuery();
        DtoTest dtoTest = new DtoTest();
        while(rs.next()){
            dtoTest.setM_seq (rs.getString(1));
            dtoTest.setM_userid(rs.getString(2));
            dtoTest.setM_pwd(rs.getString(3));
            dtoTest.setM_email(rs.getString(4));
            dtoTest.setM_hp(rs.getString(5));
            dtoTest.setM_registdate(rs.getString(6));
            System.out.println(dtoTest);
        }
    }
    public static void main(String[] args) throws SQLException {
        CallableStmtEx04 callableStmtEx04 = new CallableStmtEx04();

    }
}
