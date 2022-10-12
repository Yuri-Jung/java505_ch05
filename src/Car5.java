public class Car5 {
    TireI[] tires = new TireI[4]; //2번

    public Car5() {
        for (int i = 0; i < tires.length; i++) {
            tires[i] = new HankookTire2();
        }
//        for(TireI item : tires){  2번
//            item = new HankookTire2();
//        }

//        TireI[] tires = {   //3번
//                new HankookTire2(),
//                new HankookTire2(),
//                new HankookTire2(),
//                new HankookTire2()
//        };


//        tires[0] = new HankookTire2(); //1번 이렇게하면 귀찮으니까.

    }

        void run () {
            for (TireI item : tires) {
                item.roll();
            }
        }

}
