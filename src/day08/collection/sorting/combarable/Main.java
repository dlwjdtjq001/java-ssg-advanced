package day08.collection.sorting.combarable;

import java.util.ArrayList;
import java.util.List;

//사용자(User) 이름과 나이로 5명(객체)를 생성하고 나이순으로 정렬 한 후  사용자의 이름과 나ㅏ이를 출력하시오
//ex) 홍길동 32세
//    임준오 48세
public class Main {
    public static void main(String[] args) {

        class User implements Comparable<User>{
             String name;
             int age;

             User(String name, int age){
                 this.name = name;
                 this.age = age;
             }


            @Override
            public int compareTo(User o) {
                 return this.age-o.age;
            }

            @Override
            public String toString() {
                return "User{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }

        User user1 = new User("dds",4);
        User user2 = new User("sdf",5);
        User user3 = new User("gfd",2);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);


        userList.stream().sorted().forEach(x -> System.out.println(x));
    }
}
