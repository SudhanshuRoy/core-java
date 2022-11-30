package assign.prob1;

public class ZImpl implements Z{
    @Override
    public void oneDefault(){
        System.out.println("I am default method in interface X Overriden in Zimpl class");
    }
    @Override
    public void one() {
        System.out.println("I am abstract method one of x interface overridden in Zimpl class");
    }

    @Override
    public void two() {
        System.out.println("I am abstract method two of y interface overridden in Zimpl class");
    }

    @Override
    public void three() {
        System.out.println("I am abstract method three of z interface overridden in Zimpl class");
    }
}
