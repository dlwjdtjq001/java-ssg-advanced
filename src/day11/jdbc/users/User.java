package day11.jdbc.users;


import lombok.Data;

@Data
public class User {
    private String userid;
    private String username;
    private String password;
    private String userage;
    private String useremail;
}
