package day03homework.coffe;

public class main {
    public static void main(String[] args) {
        Person salesMan = new SalesPerson("운영하는 사람");
        Person buyer1 = new buyerPerson("단골손님1",new IceAmericano());
        Person buyer2 = new buyerPerson("단골손님2",new BerryLatte());

        System.out.println("카페를" + salesMan.whoAmI() + "이 있다.");
        System.out.println(buyer1.whoAmI() + "은 " + ((buyerPerson)buyer1).drinkSomething());
        System.out.println(buyer2.whoAmI() + "은 " + ((buyerPerson)buyer2).drinkSomething());
    }
}
