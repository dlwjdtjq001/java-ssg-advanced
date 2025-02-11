package day06.api;

public class Member1Main {
    public static void main(String[] args) {
        Member1 member1 = new Member1("shin",25);
        Member1 member2 = new Member1("shin",25);
        Person person = new Person("1", 1);
        Person person2 = new Person("1", 1);
        System.out.println(person.equals(person2));

        System.out.println(member1.name());
        System.out.println(member1.age());
        System.out.println(member1);
        System.out.println(member1.hashCode());

        System.out.println(member2.name());
        System.out.println(member2.age());
        System.out.println(member2);
        System.out.println(member2.hashCode());

        System.out.println(member1.equals(member2));


    }
}
