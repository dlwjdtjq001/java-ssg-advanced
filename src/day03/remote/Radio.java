package day03.remote;

public class Radio implements RemoteControl {
    int volume;

    public Radio(){
        System.out.println("라디오를 리모컨에 페어링합니다.");
    }
    @Override
    public void turnOn() {
        System.out.println("라디오를 켠다.");
    }

    @Override
    public void turnOff() {
        System.out.println("라디오를 끈다.");
    }


    @Override
    public int getVolume() {
        return this.volume;
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

    private int memoryVolume;
    // 내가 사용했던 이전 볼륨을 기억했다가 쉿모드 해제 이휴 다시 복원
    @Override
    public void setMute(boolean mute) {
        if(mute){
            this.memoryVolume = this.volume;
            System.out.println("무음처리");
            setVolume(RemoteControl.MIN_VOLUME);
        }else{
            System.out.println("쉿모드 해제");
            setVolume(this.memoryVolume); // 원래 볼륨으로 복원됨
        }
    }
}
