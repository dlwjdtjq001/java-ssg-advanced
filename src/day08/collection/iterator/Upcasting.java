package day08.collection.iterator;

import java.util.*;

public class Upcasting {
    public static void main(String[] args) {
        Collection<Number> data1 = new ArrayList<>();
        data1.add(1);
        Collection<Number> data2 = new HashSet<>();
        data2.add(1);
        Collection<Number> data3 = new LinkedList<>();
        data3.add(1);
    }
}
