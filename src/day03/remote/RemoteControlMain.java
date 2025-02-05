package day03.remote;

public class RemoteControlMain {
    public static void main(String[] args) {
        //1. 리모컨을 구입한다.
        RemoteControl newRemoteControl;
        //2. 새로산 리모컨에 TV를 설정한다.
        newRemoteControl = new TV();
        //3. 리모컨을 이용하여 TV를 켠다.
        newRemoteControl.turnOn();
        //4. 리모컨을 이용하여 볼륨을 10으로 설정하고 설정값을 확인한다.
        newRemoteControl.setVolume(10);
        System.out.println("볼륨은 " + newRemoteControl.getVolume());
        //5. 리모컨을 이용하여 TV를 끈다.
        newRemoteControl.turnOff();

        //1. 리모컨을 라디오로 페어링 한다.
        newRemoteControl = new Radio();
        //2. 리모컨을 이용하여 라디오를 켠다.
        newRemoteControl.turnOn();
        //3. 리모컨을 이용하여 볼륨을 20으로 설정하고 설정값을 확인한다.
        newRemoteControl.setVolume(20);
        System.out.println("볼륨은 " + newRemoteControl.getVolume());
        //4. 리모컨을 이용하여 라디오를 끈다.
        newRemoteControl.turnOff();

        newRemoteControl.setMute(true);
        newRemoteControl.setMute(false);
        RemoteControl.changeBattery();
    }
}
