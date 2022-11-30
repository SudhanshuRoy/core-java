package JA111.sprint2.day3.Assignment;
import java.util.Scanner;
public class _2CharAtGivenIndex {
    static char charOfGivenPos(String str,int n){
        return str.charAt(n);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println("Enter the String: ");

        System.out.println("Enter the character position you want to access: ");
        int n=scanner.nextInt();
        System.out.println("Character at position 2 is :");
        System.out.println(_2CharAtGivenIndex.charOfGivenPos(str,n));

    }
}
