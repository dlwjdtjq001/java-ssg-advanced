package day06.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MemberMain {
    public static void main(String[] args) {
        Member member1 = new Member("신세종");
        Member member2 = new Member("신세종");

        // 컴퓨터적인 관점
        System.out.println(member1 == member2); // 주소비교 false
        System.out.println(member1.equals(member2)); // Object equals() 주소값을 비교하기 때문에 false
        // 사용자 관점

        System.out.println(member1.hashCode());
        System.out.println(member2.hashCode());

        //리스트를 생성하고 두 객체 데이터 추가
        List<Member> members = new ArrayList<>();
        members.add(member1);
        members.add(member2);
        members.forEach(System.out::println);

        Set<Member> membersSet = new HashSet<>();
        membersSet.add(member1);
        membersSet.add(member2);
        membersSet.forEach(System.out::println);

        //Collection(HashMap, Hashset, HashTable) 객체가 논리적으로 같은지를 비교할 떄 hashCode() 먼저 확인하고 equals 를 확인함.


    }
}
