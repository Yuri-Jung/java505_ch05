public class MyClassA implements MyInterface{ //상속
//    default메서드일 경우 필요하다면 추가해도 좋지만 추상메서드는 무조건 만들어야 한다.
    @Override
    public void method1() { //MyInterface의 내용 구현함
        System.out.println("MyClassA의 method1()실행");
//        메서드1만 사용하다가 인터페이스가 업데이트되면 문제가 생김.
//        인터페이스는 상속을 받아 만드는 클래스가 반드시 있어야 한다.
//        뜬금없이 메서드2를 추가해야하는 상황이 됨 => 디폴트 메서드라는 개념생김
//        디폴트메서드가 되면 굳이 오버라이드 하지 않아도됨.
    }
    
//    @Override
//    public void method2(){
//        System.out.println("MyclassA의 method2()실행");
////        원한다면 해도된다.(디폴트메서드)
//    }
}
