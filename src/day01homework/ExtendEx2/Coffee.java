package day01homework.ExtendEx2;

public class Coffee extends Beverage{

    static int amount = 0;

    public Coffee(String name){
        super(name);
        this.amount++;
    }
    @Override
    public void calcPrice() {
        if(super.getName().equals("Americano")){
            this.price = 1500;
        }else if(super.getName().equals("CafeLatte")){
            this.price = 2500;
        }else if(super.getName().equals("Cappuccino")){
            this.price = 3000;
        }
    }
}
