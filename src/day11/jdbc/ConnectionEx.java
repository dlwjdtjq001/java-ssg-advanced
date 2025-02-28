package day11.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx {
    /**
     * The main method establishes a connection to a MySQL database,
     * registers the JDBC driver, and handles the connection lifecycle.
     *
     * @param args command-line arguments passed to the application
     * @throws ClassNotFoundException if the JDBC driver class cannot be found
     */
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
