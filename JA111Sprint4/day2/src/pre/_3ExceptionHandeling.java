package pre;

public class _3ExceptionHandeling {
    private static Object err;

    public static <err> void main(String[] args) {
        System.out.println("start of main");
        try{
            int x=100;
            int y=04;
            int z=x/y;

            System.out.println("The result is : "+z);
            System.out.println("Inside try block");
        }
        catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
            System.out.println("Inside catch block");
        }

        System.out.println("End of main");
    }
}
