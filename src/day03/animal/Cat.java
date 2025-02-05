package day03.animal;

public class Cat implements Pet , Tail{

    int tail;

    @Override
    public void play() {
        System.out.println("잘노네 ㅋㅋ");
    }

    @Override
    public void cry() {
        System.out.println("요새 고양이는 멍멍하고 운대 ㅋㅋ");
    }

    @Override
    public int haveTail() {
        return 13;
    }
}
