package day05.builder.basic;

public class HamburgerLotteria {
    public static void main(String[] args) {
        Hamburger hamburger1 = new Hamburger(1,2,3);
        Hamburger hamburger2 = new Hamburger(1,2,3,5,5);
        Hamburger hamburger6 = new Hamburger(1,2,3,5,5,7);
    }
}
// 타입이 다양할수록 생성자 메서드 수가 늘어나기 떄문에 구리다.