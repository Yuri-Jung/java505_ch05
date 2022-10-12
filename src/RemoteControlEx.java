public class RemoteControlEx {
    public static void main(String[] args) {
//        인터페이스 타입의 객체를 생성이 불가능
//        인터페이스 타입의 변수는 생성이 가능
//        다형성에 의해서 인터페이스 타입의 변수에 자식 클래스 타입의 객체를 대입하는 것이 가능함.
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();
        rc.setVolume(3);
        rc.setVolume(15);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(3);
        rc.setMute(true);
        rc.setMute(false);
        rc.setVolume(-5);
        rc.turnOff();

        rc=new RemoteControl() {
            private int volume;

            @Override
            public void turnOn() {
                System.out.println("라디오 전원을 켭니다");
            }

            @Override
            public void turnOff() {
                System.out.println("라디오 전원을 끕니다");
            }

            @Override
            public void setVolume(int volume) {
                if (volume > RemoteControl.MAX_VOLUME) {
                    this.volume = RemoteControl.MAX_VOLUME;
                } else if (volume < RemoteControl.MIN_VOLUME) {
                    this.volume = RemoteControl.MIN_VOLUME;
                }
                else {
                    this.volume = volume;
                }
                System.out.println("현재 radio 볼륨 : " + this.volume);
            }
        };
        rc.turnOn();
        rc.setVolume(50);
        rc.setMute(true);
        rc.turnOff();
//        rc.changeBattery()는 정적 메서드 이므로 인터페이스명, changeBattery()로 호출해야 함
//        정적메서드는 객체 만들어서 호출하는 것이 아님
        RemoteControl.changeBattery();

        SmartTelevision stv = new SmartTelevision();
        stv.turnOn();
        stv.turnOff();
        stv.setVolume(10);
        stv.setMute(true);
        stv.setVolume(-50);
        stv.search("kakaotalk");
        stv.turnOff();
    }
}
