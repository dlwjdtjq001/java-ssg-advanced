package day01homework.polymorphism.ex1;

public class Rectangular extends Shape{
    private double width;
    private double hight;

    public Rectangular(){
        this("직사각형");
    }
    public Rectangular(String name){
        super(name);
    }

    @Override
    public void calculationArea() {
        super.area = width * hight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
}
