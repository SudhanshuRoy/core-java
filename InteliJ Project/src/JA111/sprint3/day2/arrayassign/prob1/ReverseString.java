package JA111.sprint3.day2.arrayassign.prob1;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String originalString = sc.nextLine();
        String result = reversString(originalString);
        System.out.println("Original String is :"+ originalString);
        System.out.println("Reversed String is :"+ result);

    }
  static   String reversString(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev;
    }
}
