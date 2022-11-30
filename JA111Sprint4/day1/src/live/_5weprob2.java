package live;

public class _5weprob2 {
    public static void main(String[] args) {
        Square square=new Square();
        square.getS();
    }
}
interface Shape{
    String s="shape";
    void draw();
}
interface Rectangle{
    String s="rectangle";
    void draw();
}

class Square implements Shape,Rectangle{
    @Override
    public void draw() {
        System.out.println("Drawing square....");
    }
    void getS(){
        System.out.println(Rectangle.s);
        System.out.println(Shape.s);
    }
}