package day04.inheritence;

public class HankookTire implements Tire {
    @Override
    public void roll() {
        System.out.println("한국타이어 회전합니다.");
    }
}
