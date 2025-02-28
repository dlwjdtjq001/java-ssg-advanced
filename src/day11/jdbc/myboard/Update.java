package day11.jdbc.myboard;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.function.Consumer;

public class Update implements Consumer<Connection> {
    @SneakyThrows
    @Override
    public void accept(Connection connection) {
        Scanner scanner = new Scanner(System.in);
        String query = "UPDATE boards SET btitle=?, bcontent=? WHERE bno=?";
        PreparedStatement pstmt = connection.prepareStatement(query);
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
        connection.close();
    }
}
