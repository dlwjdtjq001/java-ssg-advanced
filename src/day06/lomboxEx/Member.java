package day06.lomboxEx;

import lombok.*;

@Data // 기본생성자 , Getter , Setter , hashCode() , equals() , toString() 자동 생성
//@Setter
//@Getter
//@EqualsAndHashCode
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 필드를 초기화시키는 생성자
//@RequiredArgsConstructor // 기본적으로 매개변수 없는 생성자 포함 , 만약 final 또는 @NotNull 이 붙은 필드가 있으면 생성자 만들어줌
//@ToString
// final은 초기화된 필드를 바꿀 수 없다.
// @NonNull null 이 아닌 다른값으로 setter 통해 변경할 수 있다.
public class Member {
    private String id;
    private String name;
    private String age;
}
