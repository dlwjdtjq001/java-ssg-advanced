package day10.ex2;

public class WorkMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.action(Prints::printWork);
        person.action(Prints::printSoccer);
        //or
        person.action(() -> System.out.println("뭔가 합니다."));
    }
}


class Prints{
    static public void printWork(){
        System.out.println("일하는 중입니다.");
    }

    static public void printSoccer(){
        System.out.println("주말에 축구 동호회에 가서 열심히 공을 찹니다.");
    }
}

