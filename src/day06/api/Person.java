package day06.api;
//데이터 전달을 위한 역할 : Dto ( Data Transfer Object ) 반복적으로 사용되는 코드를 줄이기 위해 java14 record  도입
//정보의 단위 : record , row(행)

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
