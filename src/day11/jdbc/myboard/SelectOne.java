package day11.jdbc.myboard;

import day11.jdbc.board.Board;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.function.Consumer;

public class SelectOne implements Consumer<Connection> {
    @SneakyThrows
    @Override
    public void accept(Connection connection) {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=UTC", "ssg", "ssg1234");
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
        conn.close();
    }
}
