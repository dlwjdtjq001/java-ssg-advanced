package day10.ex6;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.ordering(String::compareToIgnoreCase,"홍길동","김길동");
    }
}
