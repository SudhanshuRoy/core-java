package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to check vowel and consonant : ");
        String str= sc.next();
      Pattern p=Pattern.compile("[aeiou]");
      Matcher m=p.matcher(str);
      int count=0;
      while(m.find()){
          count++;
          System.out.println(m.start()+"-------"+m.end()+"--------"+m.group());
      }
      System.out.println(count);
    }
}
