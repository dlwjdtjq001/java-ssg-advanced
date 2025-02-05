package day03.remote;

public interface RemoteControl {
    public static int MAX_VOLUME = 30;
    public static int MIN_VOLUME = 10;

    public void turnOn();
    public void turnOff();

    void setVolume(int volume);
    int getVolume();

    default void setMute(boolean mute){
        if(mute){
            System.out.println("쉿 모드로 전환합니다,");
            setVolume(MIN_VOLUME);
        }else{
            System.out.println("쉿 모드가 해제되었습니다.");
        }
    }

    //베터리를 교체기능을 정적메소드를 통하여 구현 changeBattery()
    public static void changeBattery(){
        System.out.println("건전지를 교체합니다.");
    }



}
