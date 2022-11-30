package live.ExceptionHandeling;

public class _1ExceptionHandelingDemo {
    // subclass of run time exception is unchecked exception
    // all other exceptions are checked exception of compile time exception
    public static void main(String[] args) {
        System.out.println("Start of main method");
        int x=20;
        int y=4;

        try {
            int z=x/y;
            System.out.println("Result is : "+z);
        }catch (ArithmeticException AE){
            System.out.println(AE);
        }



        System.out.println("End of main method");
    }
}
