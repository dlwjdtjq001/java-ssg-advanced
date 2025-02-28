package day11.jdbc.users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDelete {
    public static void main(String[] args) throws ClassNotFoundException {
        Connection connection = null;
        // jdbc 드라이버 등록 : mysql db에 접근하겠습니다. 드라이버 등록
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("driver loaded ok!" + connection);
        //2. mysql db에 연결객체를 얻어와서 연결하기
        // 서버타임존 설정해야함 다르면 오류 뜸
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?severTimezone=Asia/Seoul",
                    "ssg", "ssg1234");
            System.out.println("connection ok!" + connection);

            //4. 매개변수화된 sql문 작성
//            String query = ""+
//                    "update users set userpassword = ? where userid = ?";
            String query = new StringBuilder()
                    .append(" delete from users ")
                    .append(" where userid = ? ").toString();

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"mycaptain622");
            //sql문 실행
            int rows = preparedStatement.executeUpdate();
            System.out.println("rows update completed : " + rows);
            //객체닫기
            preparedStatement.close();

        } catch (SQLException e) {
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
