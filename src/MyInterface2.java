public interface MyInterface2 extends MyInterface{
//    인터페이스 간 상속은 extends 사용해야함

//    부모 인터페이스인 MyInterface에서 상속받은 멤버 메서드 중 디폴트 메서드인
//    method2()를 오버라이딩하여 추상 메서드로 변환.
//    Interface2를 상속받는 게 있다면 method2()를 무조건 오버라이딩해줘야한다.
    @Override
    void method2(); //디폴트메서드를 추상메서드로 받음

    void method3();
}
