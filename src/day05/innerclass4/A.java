package day05.innerclass4;

public class A {

    static class B{}

    B field1 = new B();

    static B field2 = new B();

    A(){
        B b = new B();
    }

    void method1(){
        B b = new B();
    }

    static void method(){
        B b = new B();
    }
}
