/*6. Write a function that takes a string “s” and an integer “i” as an
        argument. It should return the first “i” characters.
        E.g.
        sample input (“abcde”, 3)
        output “abc”
        You can assume that the value of i is less than the size of the
        String. You should not use any loop statement.*/


package JA111.sprint2.Evaluation;
import java.util.Scanner;
public class _6Prob6 {
    String func(String str,int n){
      return str.substring(0,n);
    }
    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("Enter integer: ");
        int n=sc.nextInt();

      _6Prob6 obj=new _6Prob6();
        System.out.println(obj.func(str,n));

    }
}
