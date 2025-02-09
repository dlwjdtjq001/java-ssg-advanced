package day04.interfacetraining.extendsinterface;

        /*자식인터페이스를 구현 크랠스는 자식 인터페이스 메소드 뿌만 아니라 부모 인터페이스의 모든 추상 메소드를
        재정의 해야 하며, 구현 객체는 자식 및 부모인터페이스 변수에 대입될 수 있다.
        다식 인터페이스 변수 = new 구현클래스();
        부모 인터페이스1 변수 = new 구현클래스();
        부모 인터페이스2 변수 = new 구현클래스();

        구현 객체가 자식 인터페이스 변수에 대입되면 , 자식 및 부모 인터페이스의 차상 메소드를 모두 호출 가능
        부머 인터페이스 변수에 대입되면 부모 인터페이스에 선언된 추상 메소드만 호출이 가능하다.*/

public class Main {
    public static void main(String[] args) {
        ABCImpl abcImpl = new ABCImpl();

        InterfaceA ia = abcImpl;
        ia.methidA();
        System.out.println();

        InterfaceB iB = abcImpl;
        iB.methidB();
        //ib.methidA();

        InterfaceC ic = abcImpl;
        ic.methidA();
        ic.methidB();
        ic.methodC();

    }
}
