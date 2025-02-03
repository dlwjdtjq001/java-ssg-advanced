package day01homework.polymorphism.ex1;

public class TestShape {
    public static void main(String[] args) {
        Shape [] shape = new Shape[2];
        Circle c = new Circle();
        Rectangular r = new Rectangular();
        c.setRadius(10);
        r.setHight(20);
        r.setWidth(10);
        shape[0] = c;
        shape[1] = r;

        for(Shape s:shape){
            s.calculationArea();
            s.print();
        }
    }
}
