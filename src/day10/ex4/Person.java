package day10.ex4;

import lombok.Getter;
import lombok.Setter;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

@Setter
@Getter
public class Person {
    private String name;
    private String job;
    private String contents;
    private String song;

    public void action1(BiConsumer<String, String> work){
        work.accept(name,job);
    }
    public void action2(Consumer<String> speak){
        speak.accept(contents);
    }
    public void action3(Consumer<String> sing){
        sing.accept(song);
    }
}
