
/*
Q1)  Is there any difference between creating a string with and without a new operator?
        Explain with an example

 Ans: There are way to create String (i)Using String Literals (ii) Using new operator
 (i) Using String Literals:
 1. It creats string in string pool area and not allow dublicate content.once content is created neither you can create one more time nor remove.
  2.If you will creat 100 elements with same content it will create only once if it is not already present in string pool area and all other will same content. Address of all the variables is same as well.

  3. If you reassign the any variable then it will start pointing to new content but content is not removed form string pool area.

  4.If you use any operator "==" or "equal()" in both the if content is you will get true.

   (ii)Using new Operator;
   1. Creating dublicate element is allowed here.
   2. If you will create 100 diff variable with same content then it will created 100 times in heap area.
   Address of all the 100 variable is different.
   3. If contant of two str is same even after that if you use "==" operator to compare you will get false
   because content is same but address is different.
*/

package JA111.sprint2.day3.Assignment;
public class _1DifferentWayToCreateString {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";
        String str3=new String("abc");
        String str4=new String("abc");
        System.out.println(str1==str2); // true
        System.out.println(str1.equals(str2)); // true

        System.out.println(str3==str4);// false;
        System.out.println(str3.equals(str4));// true

        System.out.println(str1==str3); // false
        System.out.println(str1.equals(str3)); // true
    }
}