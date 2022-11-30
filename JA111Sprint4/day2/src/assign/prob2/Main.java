/*Finally, block will get executed at all conditions whether you are getting error or not getting any error.
If you are not using catch then also finally will take care of it.But it not recommended. If you any essential
info or file you can put it into finally block.

 */


package assign.prob2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 2 numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try {
            System.out.println("The quotient of "+a+"/"+b+" = "+a/b);

        }
        catch (ArithmeticException exception){
            System.out.println("DivideByZeroException caught");
        }
        finally {
            System.out.println("Inside finally block");
        }
    }
}
