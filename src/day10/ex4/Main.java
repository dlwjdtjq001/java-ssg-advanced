package day10.ex4;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setJob("가수");
        person.setName("황가람");
        person.setContents("저는 오핸 무명생활로 고생을 했답니다. 여러분 저를 사랑해주셔서 감사합니다.");
        person.setSong("반딧불");

        person.action1(Act::v1);
        person.action2(Act::v2);
        person.action3(Act::v3);

        Person person2 = new Person();

        person2.setJob("오페라 가수");
        person2.setName("조수미");
        person2.setContents("저를 오래동안 사랑해주셔서 감사합니다.");
        person2.setSong("밤의 아리아");

        person2.action1(Act::v1);
        person2.action2(Act::v2);
        person2.action3(Act::v3);
    }

    static class Act{
        static void v1(String name, String job){System.out.println(name + "는" + job + " 입니다.");}
        static void v2(String content){System.out.println(content);}
        static void v3(String title){System.out.println(title + " 노래를 부릅니다.");}
    }
}

