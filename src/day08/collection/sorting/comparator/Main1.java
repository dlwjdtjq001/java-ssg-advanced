package day08.collection.sorting.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//사용자(User) 이름과 나이로 5명(객체)를 생성하고 나이순으로 정렬 한 후  사용자의 이름과 나ㅏ이를 출력하시오
//ex) 홍길동 32세
//    임준오 48세
public class Main1 {
    public static void main(String[] args) {

        class User {
             private String name;
             private int age;

             User(String name, int age){
                 this.name = name;
                 this.age = age;
             }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

            @Override
            public String toString() {
                return "User{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }

        List<User> users = new ArrayList<User>();
        users.add(new User("홍길동", 21));
        users.add(new User("김영희", 24));
        users.add(new User("김병곤", 24));
        users.add(new User("이미진", 30));
        users.add(new User("홍길동", 23));

        Collections.sort(users, Comparator.comparing(User::getAge));
        users.forEach(System.out::println);

        Collections.sort(users, Comparator.comparing(User::getName).thenComparing(User::getAge));
        users.forEach(System.out::println);


        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        users.forEach(System.out::println);

        Collections.sort(users,(u1,u2) ->Integer.compare(u1.age, u2.age) );

        users.forEach(System.out::println);

    }
}
