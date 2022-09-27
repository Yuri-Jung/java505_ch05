import package1.A;
import package1.B;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        2022-09-27
        System.out.println("------상속 -----");

        Point p = new Point();
        p.set(1,2);
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3,4);
        cp.setColor("red");
        cp.showColorPoint();

//        문제1 클래스 sub와 multiDiv를 생성하고, SumSub에는 멤버 변수 num1,num2를 가지고
//        멤버 메서드 sum(), sub()를 가지도록 하며 MultiDiv에는 멤버 변수 result, 멤버 메서드 multi(), div()를
//        가지도록하고 , 마지막으로 Calculator 클래스를 생성하여 두 가지의 클래스 모두를 상속받아 모든 기능을 사용 할 수 있는
//        클래스로 작성하고, 각각 사칙연산을 수행하시오.
//        1. SumSub > MultiDiv > Calculator 순서대로 상속
//        2. Calculator 클래스는 나머지 연산을 위한 멤버 메서드 other()를 가지고 있음

        System.out.println();
        System.out.println("-----상속을 넘어 ------");
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);

        System.out.println("모델 : " + dmbCellPhone.model);
        System.out.println("색상 : " + dmbCellPhone.color);

        System.out.println("채널 : " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요 저는 홍길동인데요");
        dmbCellPhone.sendVoice("아~ 예 반갑습니다");
        dmbCellPhone.hangUp();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();

        Student std = new Student("홍길동","123456-1234567",1);

        System.out.println("\n\n");

        int r = 10;

        Calculator1 calculator1 = new Calculator1(); //객체생성
        System.out.println("원면적 : " + calculator1.areaCircle(r));
        System.out.println(calculator1.sum());
        System.out.println(calculator1.sub());
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면적 : " + computer.areaCircle(r));
        System.out.println(computer.sum());
        System.out.println(computer.sub());


        System.out.println("\n\n");
        SupersonicAirplaneEx supersonicAirplaneEx = new SupersonicAirplaneEx();
        supersonicAirplaneEx.execute();

        B b = new B();
        b.method();

    }
}