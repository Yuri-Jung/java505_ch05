public class Dog extends Animal {
    public Dog(String kind){
//        this.kind = "포유류";
        super(kind);
//        this.kind = kind; super생겨서 필요 없어짐.
    }

    @Override
    public void sound() {  //부모꺼를 가져와서(부모꺼는 내용없음) 내용은 본인에게 맞게 수정.
        System.out.println("멍멍");
    }
}
