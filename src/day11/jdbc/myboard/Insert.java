package day11.jdbc.myboard;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.function.Consumer;

public class Insert implements Consumer<Connection> {
    @SneakyThrows
    @Override
    public void accept(Connection connection) {
        String query = ""+
                "insert into boards(btitle,bcontent,bwriter,bdate,bfilename,bfiledata)" +
                "values(?,?,?,now(),?,?)";
        // 매개변수화된 sql문 작성
        PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1,"봄이로구나");
        preparedStatement.setString(2,"봄이 오는데 구경은 못하고 강의실에 잡혀서 jdbc 프로그래밍을 하는 나");
        preparedStatement.setString(3,"ljs");
        preparedStatement.setString(4,"spring.jpg");
        try {
            preparedStatement.setBlob(5,new FileInputStream("src/day11/jdbc/images/spring.jpg"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //sql문 실행
        int rows = preparedStatement.executeUpdate();
        System.out.println("rows : " + rows);

        // bno 값 확인
        if(rows == 1){
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if(generatedKeys.next()){
                int bno = generatedKeys.getInt(1);
                System.out.println( "bno : " + bno);
            }
            generatedKeys.close();
        }
        //객체닫기
        preparedStatement.close();
        connection.close();
    }
}
