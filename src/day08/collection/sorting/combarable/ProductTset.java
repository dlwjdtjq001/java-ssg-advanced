package day08.collection.sorting.combarable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProductTset {
    public static void main(String[] args) {
        Product p1 = new Product("갤럭시 s 25", 1200000);
        Product p2 = new Product("아이폰 15 pro", 1300000);
        Product p3 = new Product("샤오미", 100000);

        //List 사용
        List<Product> list = new LinkedList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        list.forEach(System.out::println);
        System.out.println();
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
