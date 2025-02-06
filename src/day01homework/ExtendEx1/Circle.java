package day01homework.ExtendEx1;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        this("원");
    }
    public Circle(String name){
        super(name);
    }


    @Override
    public void calculationArea() {
        super.area = radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
