package day03homework.coffe;

public class main {
    public static void main(String[] args) {
        Person salesMan = new SalesPerson("운영하는 사람");
        Person buyer1 = new buyerPerson("단골손님1",new IceAmericano());
        Person buyer2 = new buyerPerson("단골손님2",new BerryLatte());

        System.out.println(salesMan.whoAmI());
        System.out.println(buyer1.whoAmI() + ((buyerPerson)buyer1).drinkSomething());
        System.out.println(buyer2.whoAmI() + ((buyerPerson)buyer2).drinkSomething());
    }
}
