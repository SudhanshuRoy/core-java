package assign.prob4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any positive integer number : ");
        int n=sc.nextInt();
        Test test=new Test();
        int [] arr;
        arr=test.display(n);
         for(int element:arr){
             if(element!=0){
                 System.out.print(element+" ");
             }

         }
    }
}
