package day05.innerclass5.refector;

//메소드의 로컬 변수를 로컬 클래스가 사용할 경우 로컬 변수는 final 특성을 갖게 되므로 값을 읽을수만 있고 쓸 수 는 없다.
//이유: 로컬 내부에서 값을 변경하지 못하게 한다.
import day04homework.ex4.B;

class A{
    private int a = 10;
    class C{
        void method4(){
            a = 3;
        }
    }

    void useB(int param){
        int value = 1; // A 클래스의 useB 안에 정의된 로컬 클래스
        class B{
            int field1 = 10; // fianal
            static int field2 = 20;

            public B(){
                System.out.println("B");
            }

            void method(){
                System.out.println("BB");
//                System.out.println("original value field 1 " + field1);
//                field1 = 30;

                System.out.println("param = " + param);
                System.out.println("value = " + value);
//                param = 50;
                //param final
            }

            static void method2(){
                System.out.println("BBB");
            }
        }

        B b = new B();
        System.out.println(b.field1);
        System.out.println(B.field2);
        b.method();
        B.method2();
    }

}


public class ABLocalMain {
    public static void main(String[] args) {

        A a = new A();
        a.useB(30);

    }
}
