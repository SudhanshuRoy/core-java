/*Strings are immutabe whereas stringbuilders are muttable*/


package JA111.sprint2.day3.practice;

public class _8StringBuilder {
    public static void main(String[] args) {
      StringBuilder stringBuilder=new StringBuilder("muttable");
      stringBuilder.append("append");
        System.out.println(stringBuilder);
        // conversion from stringBuilder to string
        stringBuilder.toString();
        // conversion form string to StringBuilder
        String string="xyz";
        StringBuilder builder=new StringBuilder(string);
        System.out.println("a".compareTo("b"));
        System.out.println("b".compareTo("a"));
        System.out.println("a".compareTo("a"));
    }
}
