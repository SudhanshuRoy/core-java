package hashing.hasmap;
import java.util.*;

public class rough {
    public static void main(String[] args) {
        List<Character> Upper=new ArrayList<>();
        List<Character> Lower=new ArrayList<>();
        List<Integer> num=new ArrayList<>();
        String L="abcdefghijklmnopqrstuvwxyz";
        String U="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0;i<26;i++){
            Upper.add(U.charAt(i));
            Lower.add(L.charAt(i));
        }
        for(int i=0;i<=9;i++){
            num.add(i);
        }
//        System.out.println(Upper);
//        System.out.println(Lower);
//        System.out.println(num);

        String str= "All-convoYs-9-be:Alert1.";
        int n=4;
        String newStr="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Upper.contains(c)) {
               int sum=n+ Upper.indexOf(c);
               if(sum>25){
                   sum=sum%26;
               }
               newStr+=Upper.get(sum);
            }else
            if(Lower.contains(c)) {
                int sum=n+ Lower.indexOf(c);
                if(sum>25){
                    sum=sum%26;
                }
                newStr+=Lower.get(sum);
            }else if (num.contains(c)) {
              int sum=n+(int) c;
              if(sum>9){
                  sum=sum%10;
              }
              newStr+=sum;
            }else{
                newStr+=c;
            }
        }
        System.out.println(newStr);
    }
}
