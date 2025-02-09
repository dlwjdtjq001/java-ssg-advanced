package day05.innerclass2;

public class A {
    //인스턴스 멤버 클래스 B 클래스
    //B 객체는 A 클래스 내부 어디에서나 생성할 수 없고, 인스턴스 필드값, 생성자, 인스턴스 메소드에서 생성할 수 있다.
    class B{
        int field1 = 10;
        static int field2 = 20;

        B(){
            System.out.println("B 의 생성자 실행");
        }

        void method1(){
            System.out.println("B의 method1 실행");
        }
        static void method2(){
            System.out.println("B의 static method");
        }
    }

    //인스턴스 메서드
    public void useB(){
        B b = new B();
        System.out.println(field.field1);
        b.method1();

        System.out.println("B 의 정적 필드");
        System.out.println(B.field2);
        B.method2();
    }

    //인스턴스 필드값으로 B객체 생성 대입

    B field = new B();

    //생성자
    A(){
        B b = new B();
    }

    void method(){
        B b = new B();
    }
}
