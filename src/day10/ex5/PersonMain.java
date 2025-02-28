package day10.ex5;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1,2));
        personList.add(new Person(2,3));

        CalcLogic calcLogic = new CalcLogic();

        personList.forEach(person -> {
            System.out.println("첫번째 계산문");
            person.action(CalcLogic::sum);
            person.action(CalcLogic::dif);
            person.action(calcLogic::multi);
            person.action(calcLogic::div);
            System.out.println(" ");
        });
    }
}

class CalcLogic{
    static Double sum(int x, int y){
        return (double)(x + y);
    }
    static Double dif(int x, int y){
        return (double)(x - y);
    }
    Double multi(int x, int y){
        return (double)(x * y);
    }
    Double div(int x, int y){
        return (double)(x / y);
    }
}
