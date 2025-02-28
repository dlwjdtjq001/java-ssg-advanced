package day11.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionEx2 {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("",
                    "ssg", "ssg1234");
            System.out.println("connection ok!" + connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
