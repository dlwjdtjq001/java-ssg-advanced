package day11.jdbc.myboard;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.function.Consumer;

public class Delete implements Consumer<Connection> {
    @SneakyThrows
    @Override
    public void accept(Connection connection) {
        Scanner scanner = new Scanner(System.in);
        PreparedStatement pstmt = connection.prepareStatement("DELETE FROM boards WHERE bno=?");
        System.out.println("삭제할 게시글 번호");
        int num = scanner.nextInt();
        scanner.nextLine();
        pstmt.setInt(1,num);
        pstmt.executeUpdate();
        System.out.println("삭제되었습니다.");
        connection.close();
    }
}
