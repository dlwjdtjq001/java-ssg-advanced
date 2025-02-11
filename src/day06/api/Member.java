package day06.api;

import java.util.Objects;

// 객체의 동등비교
public class Member {
    String id;
    String name;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) { // equals 메소드 재정의
//        if(obj instanceof Member target){ //obj Member  타입인지  검사하고 타입변환후 target 변수에 대입
//            if(id.equals(target.id)){ //id 문자열이 같은지 비교 같으면 같은회원 true 리턴
//                return true;
//            }
//        }
//        return false;
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return true;
        Member member = (Member)obj;
        return Objects.equals(name,member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name); // 네임 필드의 해시코드를 반환한다.
    }
}
