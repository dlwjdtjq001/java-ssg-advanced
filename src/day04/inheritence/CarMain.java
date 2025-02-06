package day04.inheritence;


//필드 다형성
public class CarMain {
    public static void main(String[] args) {
        Car taxi = new Taxi(new HankookTire(), new HankookTire());
        //자동차에 타이어를 장착
        taxi.run();

        //KumohoTire 교환
        taxi.changeTire(new KumhoTire(),new KumhoTire());
        taxi.run();
    }
}
