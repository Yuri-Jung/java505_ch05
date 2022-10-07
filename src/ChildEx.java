public class ChildEx {
    public static void main(String[] args) {
//        Child child = new Child();
//
//        Parents parents = child;
//        parents.method1();
//        parents.method2();

        Parents parents = new Parents(); //객체 생성
        parents.method1(); //parents.method1()
        parents.method2(); //parents.method2()
        System.out.println("=========");

        Child child = new Child();
        child.method1(); //child에는 method1이 없음. 그니까 부모것인 parents.method1()이 나옴
        child.method2();
        child.method3();

        System.out.println("=========");


        //다형성 : 부모 클래스 타입의 변수에 자식 클래스의 객체를 대입하여 부모 클래스
//        타입의 객체인 것처럼 사용하는 것, 실제 결과물은 자식 클래스 타입의 객체가 가지고 있는 데이터로 출력
        parents = child;  //껍데기는 parents지만 내용물이 child임. 부모님 젊은 시절 옷을 입음.
        parents.method1(); //Parent - method1()
        parents.method2(); // Child-method2()
        //parents.method3(); // 실행 안됨.


//        부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입했을 경우 자동 형변환이 발생하여 자식
//        클래스 타입의 객체가 전용을 가지고 있던 멤버를 활용할 수 없음
//        부모 클래스 멤버만 사용할 수 있음.
















    }
}
