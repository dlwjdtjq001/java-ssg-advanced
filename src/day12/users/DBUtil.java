package day12.users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final DBUtil dbUtil = new DBUtil(); // Eager Singleton
    private static Connection connection;

    // private 생성자 - 외부에서 인스턴스 생성 차단
    private DBUtil() {}
    // 싱글톤 인스턴스 반환
    public static DBUtil getInstance() {
        return dbUtil;
    }

    // Connection 반환 메서드 (싱글톤이므로 하나의 connection 유지)
    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection(DatabaseConfig.URL.getValue(),DatabaseConfig.USER.getValue(), DatabaseConfig.PASSWORD.getValue());
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}