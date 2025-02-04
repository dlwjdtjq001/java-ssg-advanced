package day02.throwsEx;

public class ThrowsEx {
    public static void main(String[] args) { // main 메소드애서 throws 키워드 예외는 jvm 이 최종적으로 처리한다.
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("예외처리 " + e.getMessage());
        }
    }

    public static void findClass() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}
