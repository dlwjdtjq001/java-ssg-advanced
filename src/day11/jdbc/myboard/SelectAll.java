package day11.jdbc.myboard;

import day11.jdbc.board.Board;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.function.Consumer;

public class SelectAll implements Consumer<Connection> {
    @SneakyThrows
    @Override
    public void accept(Connection connection) {
        Board board = new Board();
        PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM boards");
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
        connection.close();
    }
}
