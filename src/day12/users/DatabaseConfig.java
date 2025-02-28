package day12.users;

public enum DatabaseConfig {
    URL("jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC"),
    USER("ssg"),
    PASSWORD("ssg1234");

    private final String value;

    DatabaseConfig(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
