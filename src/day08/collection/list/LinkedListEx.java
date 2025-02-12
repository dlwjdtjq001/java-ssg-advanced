package day08.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// array 는 기존 객체의 인덱스를 한칸씩 미뤄야함
public class LinkedListEx {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();

        List<String> list2 = new LinkedList<>();

        long startTime;
        long endTime;

        //Arraylist 컬레게션에 저장하는 시간 측정
        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            list1.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println(endTime-startTime);


        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            list2.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println(endTime-startTime);


    }
}
