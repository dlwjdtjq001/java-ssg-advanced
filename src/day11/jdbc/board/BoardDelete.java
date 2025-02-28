package day11.jdbc.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardDelete {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection conn = DriverManager.getConnection("~");
        PreparedStatement pstmt = conn.prepareStatement("DELETE FROM boards WHERE bno=?");
        System.out.println("삭제할 게시글 번호");
        int num = scanner.nextInt();
        scanner.nextLine();
        pstmt.setInt(1,num);
        pstmt.executeUpdate();
        System.out.println("삭제되었습니다.");
    }
}
