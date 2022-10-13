public class DefaultMethodEx {
    public static void main(String[] args) {
        MyInterface m1 = new MyClassA(); //인터페이스의 다형성 실행
        m1.method1();  // 추상메서드였다 오버라이딩함.
        m1.method2();  // 디폴트메서드 . 오버라이딩함.
        // 자식은 부모 변수에 자동타입변환으로 대입하여 사용가능 겉모습은 부모 알맹이는 자식. 데이터자체는 자식꺼로.
//        실행할 수 있는 거는 부모꺼.

        MyInterface m2 = new MyClassB();
        m2.method1();
        m2.method2();

//////////////////////////////////////////

        MyClassA ca = new MyClassA();
        ca.method1();

        MyClassB cb = new MyClassB();
        cb.method1();
        cb.method2();
    }
}
