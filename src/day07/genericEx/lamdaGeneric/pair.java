package day07.genericEx.lamdaGeneric;
//Pair 클래스는 두개의 타입파라미터를 T,U를 가진 제네릭 클래스. 서로 다른 타입의 두 객체를 가질 수 있다.
public class pair<T,U> {
    private T first;
    private U second;

    public pair(){};
    public pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}
