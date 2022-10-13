public interface MyInterface {
    void method1(); // 인터페이스는 대부분 public 사용. 없어도 무방. 스스로추갛람

//    void method2();

//    해당 interface를 구현하는 구현체가 여러 개가 존재할 경우 구현체의 수정없이
//    기능을 추가하고자 하는 경우에 사용하는 것이 디폴트메서드다.
    default void method2(){
        System.out.println("dMyInterface의 method2() 실행");
    }
}
