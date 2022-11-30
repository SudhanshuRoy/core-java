package JA111.sprint3.day3.live;

public class _5Abstraction {
    public static void main(String[] args) {
        MathmaticalShape shape=new Circle();
        shape.calculateArea();
    }
}
// hide details because
// 1. the requirements are not crystal clear
// 2. for the shake of flexibility and scalability
//3.overriding

//abstract classes, methods= without details
// concrete classes, methods =with all the details
abstract class MathmaticalShape{
 abstract double calculateArea();
 void printDetails(){
     System.out.println("I am abstract class and containing abstract calculate area method");
 }
}
class Circle extends  MathmaticalShape{
    int r;
    @Override
    double calculateArea(){
       return Math.PI*r*r;
    }
}
class Square extends  MathmaticalShape{
    int r;
    @Override
    double calculateArea(){
        return r*r;
    }
}
class Cylinder extends  MathmaticalShape{
    int r,h;
    @Override
    double calculateArea(){
        return 2*r*r*h;
    }
}

// If all the methods are abstract 100% abstraction