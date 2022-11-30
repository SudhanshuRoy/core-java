package JA111.sprint2.day2_wed.live;
import java.util.Scanner;
public class _1InputTaking {
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name=sc.nextLine();
            System.out.println("Enter age: ");
            int age =sc.nextInt();

            System.out.println("My name is : "+name+" age: "+age);
            sc.close();

    }
}
