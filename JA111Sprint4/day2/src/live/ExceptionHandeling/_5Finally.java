package live.ExceptionHandeling;

import java.util.Scanner;

public class _5Finally {
    public static void main(String[] args) {
        System.out.println("Enter a boolean value : ");
        Scanner sc=new Scanner(System.in);
        boolean b=sc.nextBoolean();
        int index=0;
        int [] array={1};
        try {
            int x=array[index];
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Closing the Scanner");
            sc.close();
            System.out.println("this will always will execute whether any exception or not");
            // finally is used to close the file if any exception happen then by default it close like
//            here we are closing the scanner and for similar application whic is necessary
        }
    }
}
