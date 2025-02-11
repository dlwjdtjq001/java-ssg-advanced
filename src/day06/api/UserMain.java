package day06.api;

import java.util.ArrayList;

public class UserMain {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Kim" , 100));
        users.add(new User("Park" , 101));
        users.add(new User("Lee" , 102));

//        System.out.println(users.toString());
        ArrayList<User> users1 = (ArrayList<User>) users.clone();
//        System.out.println(users1.toString());

//        users.stream().filter(x -> x.getId() == 100).forEach(x -> x.setId(101));

        users.stream().filter(x -> x.getId() == 100).forEach(x -> System.out.println(x.getId()));
        users1.stream().filter(x -> x.getId() == 100).forEach(x -> System.out.println(x.getId()));
        //복제되는 대상이 배열의 요소데이터인 Object.clone() 오버라이딩 해줌으로써 직접 for 문을 돌며 객체복사





//        // 얕은복사 (Shallow copy)
//        User user = new User();
//        user.setName("Shin");
//        User copy = user;

//        System.out.println(user.hashCode());
//        System.out.println(copy.hashCode());
//        System.out.println(user.equals(copy));
//
//        User user1 = new User();
//        user1.setName("Shin");
//        try {
//            User copy1 = (User)user1.clone();
//            System.out.println(user1.hashCode());
//            System.out.println(copy1.hashCode());
//            System.out.println(user1.equals(copy1));
//
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }

    }
}
