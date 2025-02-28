package day11.jdbc.myboard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.function.Consumer;

public class ConnectionMysql{
    public void connect(Consumer<Connection> consumer) {
        try {
            Connection connection = DriverManager.getConnection("");
            consumer.accept(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
