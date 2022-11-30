/*4. Write a function that asks the user to input his/her name and age
        (use Scanner class) and prints the same on the console.*/


package JA111.sprint2.Evaluation;
import java.util.Scanner;
public class _4Prob4 {
   static void function(String name,int age){
        System.out.println("name:"+name+" age:"+age);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Kindly enter your name: ");
        String name=sc.nextLine();
        System.out.println("Kindly enter you age: ");
        int age=sc.nextInt();
        _4Prob4.function(name,age);
    }
}
