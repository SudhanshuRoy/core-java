package assign.prob1;

public interface Y {
    public void two();
    static void twoStatic(){
        System.out.println("I am static method of Interface Y ");
    }
    default void twoDefault(){
        System.out.println("I am default method in interface Y ");
    }
}
