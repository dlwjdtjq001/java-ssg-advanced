package day01homework.ExtendEx2;

public class CoffeeShop {
    public static void main(String[] args) {
        System.out.println("****java nara CoffeeShop영업개시****");
        Beverage[] beverage = new Beverage[5];
        beverage[0] = new Coffee("Cappuccino");
        beverage[1] = new Coffee("CafeLatte");
        beverage[2] = new Tea("ginsengTea");
        beverage[3] = new Coffee("CafeLatte");
        beverage[4] = new Tea("redginsengTea");
        getSalesInfo(beverage);

        System.out.println("총 판매 금액==>"+getTotalPrice(beverage));
        System.out.println("Coffe의 판매 개수=>"+Coffee.amount+"잔");
        System.out.println("Tea의 판매 개수=>"+Tea.amount+"잔");
    }
    //결과와 같이 가격을 구하고 판매정보를 출력할 수 있도록 getSalesInfo메소드를 작성하세요

    static void getSalesInfo(Beverage[] beverage){
        for(int i = 0; i < beverage.length; i++){
            beverage[i].calcPrice();
            System.out.print(i);
            beverage[i].print();
        }
    }
    //결과와 같이 총 판매금액을 구할 수 있도록 getTotalPrice메소드를 작성하세요.

    static int getTotalPrice(Beverage[] beverage){
        int totalPrice = 0;
        for(int i = 0; i < beverage.length; i++){
            beverage[i].calcPrice();
            totalPrice += beverage[i].price;
        }
        return totalPrice;
    }

}