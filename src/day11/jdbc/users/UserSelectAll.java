package day11.jdbc.users;

import java.sql.*;

public class UserSelectAll {
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

            String query = new StringBuilder()
                    .append(" select * from users ")
                    .toString();

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            //sql문 실행
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setUserid(rs.getString("userid"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("userpassword"));
                user.setUserage(rs.getString("userage"));
                user.setUseremail(rs.getString("useremail"));
                System.out.println(user);
            }
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
