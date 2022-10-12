import package1.B;
import package2.D;

public class DriverEx {
    public static void main(String[] args) {
        Driver driver = new Driver(); //Driver클래스에 driver변수만듦

        Bus bus = new Bus();
        Taxi taxi =new Taxi();




//        driver.drive(new Vehicle());
        Vehicle vehicle = new Vehicle();

//        다형성이 아닌 각각의 객체로 실행하는 방식(기존 배운 것.)
        System.out.println("======객체로 실행========");
        bus.run();
        taxi.run();
        vehicle.run();
        System.out.println();

//        다형성을 이용하여 부모 클래스 타입의 변수에 자식 클래스 타입의  객체를 대입하여 사용.
        System.out.println("=========다형성 이용=========");
        vehicle.run();
        vehicle =bus;
        vehicle.run();
        vehicle = taxi;
        vehicle.run();
        System.out.println();


//        다른 클래스의 멤버 매서드의 매개 변수로 부모 클래스 타입의 변수를 사용시 자식 클래스 타입의 객체를
//        매개변수로 넘겨서 사용할 수 있다. 위에 것과 동일하다.(다형성 이용)
//        사용하는 방법은 동일한데 매개변수로 사용된 데이터에 따라서 다른 출력을 하고 있다.

//        driver.drive(vehicle); //원본
//        driver.drive(bus); //vehicle을 상속받아(오버라이딩) 재정의.
//        driver.drive(taxi);
//        위에 것. 들어온 값에 따라 달라진다.


    }
}
