package day01.ex01;

import java.util.ArrayList;

class Shape{}

class Rectangle extends Shape{}

class Triangle extends Shape{}

class Circle extends Shape{}


public class ShapeMain {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Rectangle());
        shapes.add(new Rectangle());
        shapes.add(new Rectangle());
        shapes.add(new Triangle());
        shapes.add(new Circle());

        shapes.stream().forEach(System.out::println);
    }
}
