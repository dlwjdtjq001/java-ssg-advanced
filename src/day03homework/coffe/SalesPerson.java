package day03homework.coffe;

public class SalesPerson implements Person{
    String name;

    public SalesPerson(String name) {
        this.name = name;
    }

    @Override
    public String whoAmI() {
        return this.name;
    }
}
