package day07.genericEx.classGeneric;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("인형");
        stringBox.setItem("곰돌이");
        stringBox.setItem("기차장난감");

        System.out.println(stringBox.getItem());
        System.out.println(stringBox.getCount());

    }


}
