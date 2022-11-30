package assign.prob1;

public interface X {
    public void one();
    static void oneStatic(){
        System.out.println("I am static method of Interface X.");
    }
    default void oneDefault(){
        System.out.println("I am default method in interface X ");
    }
}
