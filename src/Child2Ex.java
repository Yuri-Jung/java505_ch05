import package2.C;

public class Child2Ex {
    public static void main(String[] args) {
//        자동 타입 변환
//        부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입하면 부모 클래스 타입의 멤버만 사용이 가능하다.
//        (알맹이는 자식 클래스 타입의 객체)
        Parent2 parent2 = new Child2();
        parent2.field1 = "data1";
        parent2.method1();
        parent2.method2();

//        parent2.field2 = "데이터2"; //error 부모 흉내를 내고 있기 때문에 본인이 가지고 있는 것을 사용하지못한다.
//        parent2.method3(); //error

        System.out.println("\n=====자식 클래스 타입의 변수에 자식 클래스 타입의 객체 대입=====\n"); // 상속받은 모든 걸 사용할 수 있다.
        Child2 child2 = new Child2();
        child2.field1 = "데이터1";
        child2.field2 = "데이터2";
        child2.method1();
        child2.method2();
        child2.method3();

        System.out.println("\n------다시 자식 클래스 타입으로 돌아갈 때------\n");

        Child2 child21 = new Child2();
        child21.field1 = "Parent2에서 상속받은 멤버 변수"; //상속
        child21.field2 = "전용으로 가지고 있는 멤버 변수";
        System.out.println("객체 child21의 field1 출력 : " + child21.field1);
        System.out.println("객체 child21의 field2 출력 : " + child21.field2);
        System.out.println("객체 child21의 method1 실행 : ");
        child21.method1(); //상속
        System.out.println("객체 child21의 method2 실행 : ");
        child21.method2(); //상속
        System.out.println("객체 child21의 method3 실행 : ");
        child21.method3();

        System.out.println("\n부모 객체로 자동 타입 변환 \n");

        Parent2 parent21 = child21;
        System.out.println("객체 parent21의 field1 출력" + parent21.field1);
//        System.out.println("객체 parent21의 field1 출력" + parent21.field2); //에러난다.

        System.out.println("객체 parent21의 field1 출력 : " + parent21.field1);
//        System.out.println("객체 parent21의 field2 출력 : " + parent21.field2); // 에러 난다. 자식 클래스 전용
        System.out.println("객체 parent21의 method1 실행 : ");
        parent21.method1(); //상속
        System.out.println("객체 parent21의 method2 실행 : ");
        parent21.method2(); //상속
        System.out.println("객체 parent21의 method3 실행 : "); //자식 클래스 타입의 전용이기 때문에 사용안된다.
//        parent21.method3(); 에러

        System.out.println("\n다시 자식 클래스 타입으로 변환\n");

//        자식 클래스 타입의 변수에 부모 클래스 타입의 객체를 대입하면 오류 발생
//        원본 객체를 자식 클래스 타입의 변수로 타입 변환 시 해당 객체의 모든 멤버를 가지고 있는지
//        알 수 없기 때문에 강제 타입 변환을 해야 한다.
        Child2 child22 = (Child2)parent21; //무조건 앞에 () 씌워야
//        child22.field1 = "Parent2에서 상속받은 멤버 변수"; //상속
//        child22.field2 = "전용으로 가지고 있는 멤버 변수";
        System.out.println("객체 child22의 field1 출력 : " + child22.field1);
        System.out.println("객체 child22의 field2 출력 : " + child22.field2);
        System.out.println("객체 child22의 method1 실행 : ");
        child22.method1();
        System.out.println("객체 child22의 method2 실행 : ");
        child22.method2();
        System.out.println("객체 child22의 method3 실행 : ");
        child22.method3();

        System.out.println("\n다시 자식 클래스 타입으로 변환되는 조건\n");
//      1. 원본이 자식 클래스 타입이어야 해당하는 자식 클래스 타입으로 변환이 가능.

//        원본이 부모 클래스 타입
//        Parent2 parent23 = new Parent2();
////        자식 클래스 타입의 변수 선언
//        Child2 child23;
////        자식 클래스 타입의 변수에 부모 클래스 타입의 객체를 대입
////        문법 상의 오류는 없으나 원본이 자식 클래스 타입의 객체가 아니기 때문에 런타임 에러(실행하는 순간 에러)가 발생
//        child23 = (Child2) parent23; //여기서 오류 child23 = (Child2) parent23;
////        자식 클래스 타입의 객체의 멤버를 사용
//        child23.method3();

        Parent2 parent24 = new Child2(); //알맹이는 child2
        castMethod1(parent24); //성공
        castMethod2(parent24); //성공

        Parent2 parent25 = new Parent2();
        castMethod1(parent25); //25로 변환되지 않음
        castMethod2(parent25); //오류 발생

    }
    public static void castMethod1(Parent2 parent){
//        instanceof 연산자를 사용하면 현재의 객체가 지정한 타입의 객체인지 확인이 가능함. 반드시 사용하자.
        if(parent instanceof Child2){
            Child2 child = (Child2) parent;
            System.out.println("castMethod1 - Child2로 변환 성공");
        }
        else{
            System.out.println("castMethod2 - Child2로 변환 되지 않음");
        }
    }

    public static void castMethod2(Parent2 parent){
//        원본 객체가 변환하려는 클래스 타입의 객체가 아닐 수 있기 때문에 오류가 발생할 수 있음.
        Child2 child = (Child2) parent;
        System.out.println("castMethod1 - Child2로 변환 성공");
    }
}
