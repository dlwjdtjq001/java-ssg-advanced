package day01;

class A{ }
class B extends A{}
class D extends B{}
class C extends A{}
class E extends C{}


public class PromotionMain1 {
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();

    A a1 = b;
    A a2 = c;
    A a3 = d;
    A a4 = e;

    B b1 = d;
    C c1 = e;

//    B b2 = e; 컴파일 에러 ( 상속관계에 이씨 않다. )
//    C c2 = d;
}
