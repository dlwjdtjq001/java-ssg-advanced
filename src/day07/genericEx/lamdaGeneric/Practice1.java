package day07.genericEx.lamdaGeneric;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("asd");
        names.add("fsd");
        names.add("gfdgdf");

        names.forEach(x -> System.out.println(x));
    }
}
