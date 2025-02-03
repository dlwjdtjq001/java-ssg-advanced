package day01.ex01;

public class TVMain {
    public static void main(String[] args) {
        TV tv_remoteControl1 = new TV(); // 동일한 클래스 타입의 참조 변수를 생성해서 초기화
        TV tv_remoteControl2 = new SmartTV(); // 부모 타입으로 자식 클래스 타입을 받아 초기화
        //TV 클래스 타입의 탐조변수 tv_remoteControl2 를 선언하고, SmartTV인스턴스를 생성하여, 이 인스턴스의 주소값를 참조변수 tv_remotecontrol2 에 저장한다.
        SmartTV smartTV_Control = new SmartTV();

        TV tv = new TV();
        SmartTV smart_control = (SmartTV) tv;
    }
}
