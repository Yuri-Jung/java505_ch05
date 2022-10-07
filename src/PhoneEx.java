public class PhoneEx {
    public static void main(String[] args){
        SmartPhone smartPhone = new SmartPhone("홍길동");
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

        //Phone 클래스는 추상 클래스이므로 new 키워드를 통해 객체 생성할 수 없음
//        Phone phone = new Phone("홍길동") ;

//        Phone phone;
//        phone = new Phone("홍길동"); //추상클래스니까 직접적인 객체 클래스 생성불가능. 자식에게 상속받아 사용해야 한다.
    }
}
