package day01homework.ExtendEx2;

public class Tea extends Beverage{
    static int amount = 0;

    public Tea(String name){
        super(name);
        this.amount++;
    }
    @Override
    public void calcPrice() {
        if(super.getName().equals("LemonTea")){
            this.price = 1500;
        }else if(super.getName().equals("ginsengTea")){
            this.price = 2000;
        }else if(super.getName().equals("redginsengTea")){
            this.price = 2500;
        }
    }
}
