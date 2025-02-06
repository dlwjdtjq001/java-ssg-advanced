package day04.inheritence;

public class Taxi implements Car {

    Tire tire1;
    Tire tire2;

    public Taxi(Tire tire1, Tire tire2) {
        this.tire1 = tire1;
        this.tire2 = tire2;
    }

    public void changeTire(Tire tire1, Tire tire2) {
        this.tire1 = tire1;
        this.tire2 = tire2;
    }

    public void run() {
        tire1.roll();
        tire2.roll();     //인터페이스에 선언된 추상메소드를 호출했다.  구현 객체의 roll메소드를 설정
    }
}
