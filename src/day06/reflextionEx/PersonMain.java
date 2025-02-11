package day06.reflextionEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class PersonMain {
    public static void main(String[] args) throws Exception{
        //클래스 객체 가져오기(Class.forName())
        Class<Person> personClass = (Class<Person>)Class.forName("day06.reflextionEx.Person");
        //생성자 가져오기 -Person(String Name. int age
        Constructor<Person> constructor = personClass.getConstructor(String.class , int.class);

        // 가져온 생성자로 인스턴스 만들기
        Person p1 = constructor.newInstance("신세계", 30);
        // 동적으로 메서드 가져와서 실행
        p1.getField(); //invoke()
        //접근 제한자 public, public static, private methods

        Method total = personClass.getMethod("total", int.class, int.class);
        int result1 = (int) total.invoke(new Person(), 10, 20);
        System.out.println("result1 = " + result1);

        //특정 static 메서드 가져와 실행
        Method staticTotal = personClass.getMethod("staticTotal", int.class, int.class);
        int result2 = (int)staticTotal.invoke(null, 100, 200);
        System.out.println("result2 = " + result2);

        Method privateTotal = personClass.getDeclaredMethod("privateTotal", int.class, int.class);
        privateTotal.setAccessible(true);
        int privateResult = (int)privateTotal.invoke(new Person(), 200, 300);
        System.out.println("privateResult = " + privateResult);
    }
}
