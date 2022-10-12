public class ImplEx {
    public static void main(String[] args) {
        System.out.println("구현체 implC의 객체 impl은 모든 메서드 사용 가능");
        ImplC impl = new ImplC();

        impl.methodA();
        impl.methodB();
        impl.methodC();

        System.out.println("\nInterfaceA의 변수에 대입 시");
        InterfaceA ifA = impl;
        ifA.methodA();


        System.out.println("\nInterfaceB의 변수에 대입 시");
        InterfaceB ifB = impl;
        ifB.methodB(); //b만 있음


        System.out.println("\nInterfaceC의 변수에 대입 시");
        InterfaceC ifC = impl;
        ifC.methodC(); //3개가 다 있다. 할머니, 할아버지께 다 물려받음
        ifC.methodB();
        ifC.methodA();
    }
}
