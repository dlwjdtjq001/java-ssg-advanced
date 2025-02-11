package day06.api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User implements Cloneable { //객체복사 메소드를 사용하기 위해서 cloaneable  인터페이스를 구현하여 clone() 사용
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

//
//    @Override
//    protected User clone() throws CloneNotSupportedException {
//        return clone();
//    }
}
