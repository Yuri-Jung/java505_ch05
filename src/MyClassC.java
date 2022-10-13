public class MyClassC implements MyInterface2{
    
    
    @Override
    public void method1() {
        System.out.println("MyClassC의 method1() 실행");
    }
//  1번. MyInterface에서 상속받은 추상메서드
    @Override
    public void method2() {
        System.out.println("MyClassC의 method2() 실행");
    }
//  2번. MyInterface에서 디폴트 메서드로 상속해줬으나 MyInterface2에서 추상메서드로 오버라이딩한 메서드
//    MyInterface2를 구현하는 구현체는 반드시 해당 메서드를 구현해야 함.
    @Override
    public void method3() {
        System.out.println("MyClassC의 method3() 실행");
    }
//    3번. MyInterface2에서 전용으로 생성한 추상메서드
}
