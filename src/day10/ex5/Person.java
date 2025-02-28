package day10.ex5;

import day10.ex2.Workable;

import java.util.function.BiFunction;
import java.util.function.Supplier;

//Person 클래스는 Calculable 을 매개변수로 갖는 calculate 메소드를 가지고 있다.

public class Person {
    private int x;
    private int y;

    public Person(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void action(BiFunction<Integer,Integer,Double> calculate){
        System.out.println(calculate.apply(x,y));
    }
}
