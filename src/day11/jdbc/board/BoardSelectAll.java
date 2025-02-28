package day11.jdbc.board;

import java.sql.*;
import java.util.Scanner;

public class BoardSelectAll {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        Connection conn = DriverManager.getConnection("");
        PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM boards");
        pstmt.executeQuery();
        ResultSet rs = pstmt.getResultSet();
        while (rs.next()) {
            board.setBno(rs.getInt("bno"));
            board.setBtitle(rs.getString("btitle"));
            board.setBcontent(rs.getString("bcontent"));
            board.setBwriter(rs.getString("bwriter"));
            board.setBdate(rs.getString("bdate"));
            board.setBfilename(rs.getString("bfilename"));
            board.setBfiledata(rs.getString("bfiledata"));
            System.out.println(board);
        }
    }
}
