package day11.jdbc.myboard;

public class BoardMain {
    public static void main(String[] args) {
        ConnectionMysql connectionMysql = new ConnectionMysql();
        Insert insert = new Insert();
        SelectAll selectAll = new SelectAll();
        SelectOne selectOne = new SelectOne();
        Update update = new Update();
        Delete delete = new Delete();

        connectionMysql.connect(delete::accept);
        connectionMysql.connect(insert::accept);
        connectionMysql.connect(selectAll::accept);
        connectionMysql.connect(selectOne::accept);
        connectionMysql.connect(update::accept);
    }
}
