package day04homework.ex4;

public class Main {
    static void action(A a){
        if(a instanceof C obj){
            obj.method1();
            obj.method2();
        }else a.method1();
    }
    public static void main(String[] args) {
        action(new C());
        System.out.println("---------");
        action(new B());
    }
}
