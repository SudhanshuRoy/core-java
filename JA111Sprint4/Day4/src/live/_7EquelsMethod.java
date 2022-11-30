package live;

import java.lang.String;

public class _7EquelsMethod {
    public static void main(String[] args) {
        Student s1=new Student("sonu",1,1);
        Student s2=new Student("sonu",1,1);
        System.out.println(s1.equals(s2));

        /*String str1="sonu";
        String str2="sonu";
        String str3=new String("sonu");
        String str4=new String("sonu");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));
        System.out.println(str1==str4);
        System.out.println(str1.equals(str4));*/


    }
}
//equals method was checking content of sting in string but here int case of object
// it is checking whether there memory address are same or not.