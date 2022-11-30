package democollection;
import java.util.Arrays;
import java.util.Stack;
import  java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        String str="ab#d";
        Stack<Character> stack=new Stack<>();
         for(int i=0;i<str.length();i++){
             if(stack.size()!=0 && str.charAt(i)=='#'){
                 stack.push(str.charAt(i));
             }else{
                 stack.pop();
             }
         }
        stack.forEach(ele-> System.out.print(ele));

         Scanner sc=new Scanner(System.in);
         char ch=sc.next().charAt(0);
    }

}
