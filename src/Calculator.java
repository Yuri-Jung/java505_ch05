
public class Calculator extends MultiDiv{
    public static void main(String[] args) {

        MultiDiv md = new MultiDiv();
        md.num1 = 3;
        md.num2 = 2;

        md.sum();
        System.out.println(md.sum());
        md.sub();
        System.out.println(md.sub());

        md.multi();
        System.out.println(md.multi());
        md.div();
        System.out.println(md.div());

        md.other();
        System.out.println(md.other());

    }
}
