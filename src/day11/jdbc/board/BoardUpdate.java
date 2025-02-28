package day11.jdbc.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.function.Supplier;

public class BoardUpdate {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection conn = DriverManager.getConnection("");

        String query = "UPDATE boards SET btitle=?, bcontent=? WHERE bno=?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        String title = scanner.nextLine();
        System.out.println("title 입력");
        pstmt.setString(1,title);
        String content = scanner.nextLine();
        System.out.println("내용 입력");
        pstmt.setString(2,content);
        System.out.println("몇번 게시물 바꿀거야?");
        int num = scanner.nextInt();
        scanner.nextLine();
        pstmt.setInt(3,num);

        pstmt.executeUpdate();
        System.out.println("업데이트 완료");
        pstmt.close();
        conn.close();
    }
    public void update(Supplier<Connection> supplier){

    }
}
