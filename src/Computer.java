public class Computer extends Calculator1{
    @Override
    double areaCircle(double r){  //이 부분이 부모와 똑같아야한다. 코드 블럭은 달라도 상관없다.
//        데이터 타입, 이름, 매개변수 같아야..
        System.out.println("Computer 객체의 areaCircle() 실행");
        System.out.println("수정된 내용임");
        return Math.PI * r * r;
    }
   @Override  //부모껄 그대로 쓰는 게 아니라 고쳐 쓴다. 무조건!! 앞부분 똑같이 써야 한다.
    int sum(){
        System.out.println("오버라이딩 출력하기 : " + (20 + 10));
        return 20+10;
    }


    int sub(int num1,int num2){  //위에 @Override가 붙어있지 않으면 좀 달라져도 오류표시안해줌
// 아예 다른 메소드로 인식함. 오버라이딩이 아닌, 오버로드로 인식!!
        System.out.println("오버라이딩 사용 출력하기 : " + (10-3));
        return 10-3;
    }
}
