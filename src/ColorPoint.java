public class ColorPoint extends Point {
//    extend : 상속
    public String color;

    public void setColor(String color) {
        this.color = color;
    }


    public void showColorPoint() {
        System.out.println(color);
        showPoint();
//  상속을 받아 밑 부분 중복코드 없어도 된다
//        private int x,y;
//        public void setColor(int x,int y) {
//            this.x =x;
//            this.y = y;
//        }
//
//        public void showPoint(){
//            System.out.println("(" + x+ "," + y + ")");
//        }

    }
}

