
/*
Que:7:  Explain the concept of static in Java.
        Ans:
        1.Java is a dynamic programming language i.e, only static members of class will be loaded to RAM
        which need to be executed.Any member of any class containing static keyword is static member.
        2.Non-static members can be loaded dynamically with the help of objects of that class.

        3. Static members are related to class so to use static member you can use class as well.

        4. This keyword is object of current class i.e, related to object whereas static is related to class
          Which means you can’t use this keyword in static area. Main method is always static i.e you can’t use
           this keyword in main method.

        5. Constructor creates objects that is constructor are related to object you can’t relate constructor to
        class. Which means you can’t use static keyword for constructor at all.
*/


package JA111.sprint2.Evaluation;

public class _7Prob7 {
    int x=10;
    static String str="Sonu";

    public static void main(String[] args) {
        System.out.println(_7Prob7.str); // static member;
        _7Prob7 obj=new _7Prob7();
        System.out.println(obj.x);  // Non-static member
    }
}
