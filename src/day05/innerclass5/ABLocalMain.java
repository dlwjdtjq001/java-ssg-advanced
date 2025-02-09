package day05.innerclass5;


class A{
    public A(){
        class B{
            int a;
        }
        B b = new B();
    }


    void method(){
        class B{}

        B b = new B();
    }
}


public class ABLocalMain {
    public static void main(String[] args) {
        A a = new A();

        a.method();


    }
}
