package JA111.sprint2.day3.practice;

public class _6StringMethods {
    public static void main(String[] args) {
        String s1="hi";
        String s2="hello";
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));

        String s="string";

        System.out.println(s.charAt(3));
        System.out.println(s.substring(1)); // start at index 1 till and end;

        System.out.println(s.substring(1,2+1)); // start at index 1 and go to 2 lastOne is excluded.
        String s5="Hello there";
        System.out.println(s5.indexOf('t'));
        System.out.println(s5.lastIndexOf('e'));

        String s6="HowAreYou";
        System.out.println(s6.indexOf("Are"));

        // == compare the memory address of two strings
        // equals() method compares the content and not the address;

        String x="xyz";
        String y="xyz";
        String z=new String("xyz");
        System.out.println(x==y);
        System.out.println(x.equals(y)); // true
        System.out.println(x.equalsIgnoreCase(y));
        System.out.println(x==z); // false
        System.out.println(x.equals(z)); // true

        // trim() works same as js trim last and start spaces removed.

// strings are immutable (constant or not replacable
    }
}
