package day07homework;
//3. Compareable<T> 를 확장하는 타입의 두 객체를 비교하는 
//제너릭 메소드 compareTo를 작성하세요. 이 메서드를 이용하여 두 숫자를 비교하세요
public class BoundedGenericMethod {
    public static<T extends Comparable<T>> void check(T a, T b){
        System.out.println(a.compareTo(b) > 0 ? "첫번째 수가 큽니다." : "첫번쨰 수가 크지 않습니다.");
    }
}
