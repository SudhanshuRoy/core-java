package JA111.sprint2.day4_fri.assign;
import java.util.Locale;
import java.util.Scanner;
public class _3VowelConsonent {


    void vowelConsonent(String c){

     if(c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u") ){
         System.out.println("vowel");
     }else{
         System.out.println("consonant");

     }


    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("kindly enter any alphabet to check vowel and consonant: ");
String c =sc.next();
_3VowelConsonent obj=new _3VowelConsonent();
c=c.toLowerCase();

        obj.vowelConsonent(c);
//String str="abcdefghijklmnopqrstuvwxyz";
//for(int i=0;i<str.length();i++){
//
//    if((str.charAt(i) != c)){
//
//    }
//    System.out.println(str.charAt(i));
//}
//obj.vowelConsonent(c);
    }

}
