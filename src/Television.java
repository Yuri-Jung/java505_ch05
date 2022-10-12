public class Television implements RemoteControl{ //alt enter
    private int volume;

    @Override
    public void turnOn(){ //오버라이딩해서 몸통만들어줌. 안만들면 오류뜬다
        System.out.println("TV 전원을 켭니다");
    }

    @Override
    public void turnOff(){
        System.out.println("TV 전원을 끕니다");
    }

    @Override
    public void setVolume(int volume){
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else{
            this.volume = volume;
        }
        System.out.println("현재 tv 볼륨: " + this.volume);
    }
}
