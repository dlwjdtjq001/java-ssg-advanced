package day07.genericEx.lamdaGeneric;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("i", "a", "m");

        List<String> filterWords = words.stream().filter(word -> word.length() > 4).map(word -> word.toUpperCase())
                .toList();

        System.out.println(filterWords);
    }
}
