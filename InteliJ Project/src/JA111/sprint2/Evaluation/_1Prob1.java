/*1. Explain the difference between == operator and equals() method
        with a code example.
        
Ans: 1. "==" operator compares reference whereas equals to operator compare content.
     2. if content is same but created at two address then by "==" returns false
     whereas if content is same you will always get true whatever address is does not matter.
     3. If you create string by string literals address is always same if content is same that's why by both
     the operator you are getting true.
     4. If you create String by new operator address is always different that's why even if content is you
     are getting false even if content is same.
  */
package JA111.sprint2.Evaluation;

public class _1Prob1 {
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
