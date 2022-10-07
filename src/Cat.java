public class Cat extends Animal {
    public Cat(String kind) {
//        this.kind = "포유류";
        super(kind);
    }
    
    @Override
    public void sound(){
        System.out.println("냐옹");
    }
}
