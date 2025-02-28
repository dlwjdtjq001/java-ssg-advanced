package day11.jdbc.board;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class BoardInsert {
    public static void main(String[] args) throws ClassNotFoundException {
        Connection connection = null;
        // jdbc 드라이버 등록 : mysql db에 접근하겠습니다. 드라이버 등록
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("driver loaded ok!" + connection);
        //2. mysql db에 연결객체를 얻어와서 연결하기
        // 서버타임존 설정해야함 다르면 오류 뜸
        try {
            connection = DriverManager.getConnection("",
                    "ssg", "ssg1234");
            System.out.println("connection ok!" + connection);

            //4. 매개변수화된 sql문 작성
            String query = ""+
                    "insert into boards(btitle,bcontent,bwriter,bdate,bfilename,bfiledata)" +
                    "values(?,?,?,now(),?,?)";
            // 매개변수화된 sql문 작성
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,"봄이로구나");
            preparedStatement.setString(2,"봄이 오는데 구경은 못하고 강의실에 잡혀서 jdbc 프로그래밍을 하는 나");
            preparedStatement.setString(3,"ljs");
            preparedStatement.setString(4,"spring.jpg");
            preparedStatement.setBlob(5,new FileInputStream("src/day11/jdbc/images/spring.jpg"));

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

        } catch (SQLException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally{
            if(connection != null){
                try {
                    connection.close();
                    System.out.println("connection closed");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
