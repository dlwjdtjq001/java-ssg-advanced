package day03.remote;

import java.sql.SQLOutput;

public class TV implements RemoteControl {

    int volume;

    public TV(){
        System.out.println("티비를 리모컨에 연결합니다.");
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void turnOn() {
        System.out.println("TV의 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV의 전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
            System.out.println("이미 최대볼륨");
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
            System.out.println("mute");
        } else {
            this.volume = volume;
        }
    }
}
