package day01homework.ExtendEx2;

public abstract class Beverage {
    private String name;
    protected int price;


    public Beverage(String name){
        this.name = name;
    }

    public abstract void calcPrice();

    public void print(){
        System.out.println("번쨰 판매 음료는 " + this.getName() + "이며, 가격은" +
                this.price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
