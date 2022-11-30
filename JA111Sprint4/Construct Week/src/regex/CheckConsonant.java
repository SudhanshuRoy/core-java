package regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class CheckConsonant {

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        System.out.println("Entr any word to check consonant : ");
        String str=sc.next();
       Pattern p=Pattern.compile("@gmail.com");
       Matcher m=p.matcher(str);
       int count=0;
       while(m.find()){
           count++;
           System.out.println(m.start()+"    "+m.end()+"     "+ m.group());
       }
       System.out.println(count);
    }
}
