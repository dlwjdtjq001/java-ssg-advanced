package day05.builder.builderpettern;

public class HamburgerLotteria {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger(new Hamburger.BurgerBuilder("플랫", "쇠고기")
                .addBacon()
                .addCheese()
                .addTomato()
                .addLettuce());

        HamburgerSet hamburgerSet = new HamburgerSet(new HamburgerSet.BurgerSet(new Hamburger(new Hamburger.BurgerBuilder("플랫", "쇠고기")
                .addBacon()
                .addCheese()
                .addTomato()
                .addLettuce())).addDrink("콜라").addPotato("후라이"));

        System.out.println(hamburgerSet);
    }
}
// 기존 생성자 오버로딩에서 보였던 가독성 문제가 해결되고 파라미터에 대해 해당되는 setter 메서드를 호출하면서 유연하게 객체 생성이 가능해짐.
//1. 일관성 문제(consistency)
// 필수 매개변수의 선택적으로 셋팅될 수 있으므로 일관성 문제가 발새한다.
// 필수멤버 : 객체가 초기화 될때, 반드시 설정이 되어야 하는 값.
//객체를 생성하는 부분과 값을 설정하는 부분이 무릴적으로 떨어져 있어서 발생하는 문제점이다.

//2. 불변성(immutable)