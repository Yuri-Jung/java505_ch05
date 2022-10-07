public class AnimalEx {
    public static void animalSound(Animal animal){
        animal.sound();
    }
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이");
        Cat cat = new Cat("냐옹이");

        dog.breathe();
        dog.sound();
        cat.breathe();
        cat.sound();
        System.out.println("===================");

//        Animal animal = new Animal()

//        추상 클래스 타입의 변수를 선언하는 것은 문제가 없음
//        클래스의 형변환

        Animal animal;
//        animal = new Animal(); //본인은 추상 클래스니까 오류남.

        animal = new Dog("멍멍이"); //이건 오류안남
        animal.sound();// .sound(); //멍멍이라고 뜸

        animal = new Cat("고양이");
        animal.sound(); //냐옹

        animalSound(new Dog("멍멍이"));
        animalSound(new Cat("냐냐옹이"));

    }
}

