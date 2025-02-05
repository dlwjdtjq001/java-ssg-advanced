package day03homework.coffe;

public class buyerPerson implements Person{

    Drink drink;

    String name;

    public buyerPerson(String name , Drink drink) {
        this.name = name;
        this.drink = drink;
    }

    @Override
    public String whoAmI() {
        return this.name;
    }

    public String drinkSomething(){
        return drink.drink();
    }
}
