package day01;

public class SmartPhoneMain {
    public static void main(String[] args) {

        SmartPhone myPhone = new SmartPhone("갤럭시", "화이트");

        //Phone 으로부터 상속받은 필드 읽어서 출력
        System.out.println(myPhone.color);
        System.out.println(myPhone.model);

        //smartPhone 메소드 호출
        myPhone.setWifi(true);

        //SmartPhone 필드
        System.out.println(myPhone.wifi);

        //phone 메소드 호출
        myPhone.bell();
    }
}
