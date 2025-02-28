package day10.ex6;

import java.util.function.BiFunction;

public class Person {
    public void ordering(BiFunction<String,String,Integer> comparable, String a, String b){

        int result = comparable.apply(a,b);

        if(result <0) {
            System.out.println(a + "는 " + b + "보디 앞에 옵니다.");
        } else if(result == 0){
            System.out.println(a + "는 " + b + "와 같습니다.");
        } else System.out.println(a + "는 " + b + "보디 뒤에 옵니다.");
    }
}
