package day11.jdbc.board;

import java.sql.*;
import java.util.Scanner;

public class BoardSelectOne {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        Connection conn = DriverManager.getConnection("");
        PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM boards WHERE bno=?");
        System.out.println("찾아올 게시글 인덱스 번호는?");
        int num = scanner.nextInt();
        scanner.nextLine();
        pstmt.setInt(1, num);
        pstmt.executeQuery();
        ResultSet rs = pstmt.getResultSet();
        if (rs.next()) {
            board.setBno(rs.getInt("bno"));
            board.setBtitle(rs.getString("btitle"));
            board.setBcontent(rs.getString("bcontent"));
            board.setBwriter(rs.getString("bwriter"));
            board.setBdate(rs.getString("bdate"));
            board.setBfilename(rs.getString("bfilename"));
            board.setBfiledata(rs.getString("bfiledata"));
        }
        System.out.println(board);
    }
}
