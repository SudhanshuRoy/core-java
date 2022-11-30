package hashing.hasmap;
import java.util.*;

public class MapAlphabatte {
    public static void main(String[] args) {
        Map<Character,Integer> Upper=new LinkedHashMap<>();
        Map<Character,Integer> Lower=new LinkedHashMap<>();
        String L="abcdefghijklmnopqrstuvwxyz";
        String U="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0;i<26;i++){
            Upper.put(U.charAt(i),i+1);
            Lower.put(L.charAt(i),i+1);
        }
        Set<Integer> num=new HashSet<>();
        for(int i=0;i<=9;i++){
            num.add(i);
        }
        System.out.println(Upper);
        System.out.println(Lower);
        System.out.println(num);

       String str= "All-convoYs-9-be:Alert1.";
       int n=4;
       String newStr="";
       for(int i=0;i<str.length();i++){
           Character c=str.charAt(i);
           if(Upper.containsKey(c)){
               int sum=Upper.get(c)+4;
               if(Upper.containsValue(sum)){
//                   newStr+=Upper.
               }
           }
       }
    }
}
