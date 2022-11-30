/*String literals create object in string pool area of memory and in that area creating dublicate
content is not allowed. it first search in string pool and if not present already then only create new content
otherwise our new variable start pointing same content which is already created.

new operator create object in heap area if you create 100 diff variable of same content it will crate 100 time
but in string pool it will be created once and all will point to same object and all variable have same address.

but in heap case all variables have diff address but same content the to equate content use equal to operator.
 */


package JA111.sprint2.day3.practice;

public class _5String {
    public static void main(String[] args) {
        String s1="value";  //strings literals
        String s2=new String("value");  //String with new operator
        System.out.println(s1==s2);

        String str1="content";
        String str2="content";
        System.out.println(str1==str2);

        String s5=new String("p");
        String s6=new String("p");
        System.out.println(s5==s6);
    }

}
