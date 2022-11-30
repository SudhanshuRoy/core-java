package JA111.sprint2.day1_tue.Live;

public class _1InstaceVariableLocalVariable {
    static int a; // instance variable because inside class. default value only for instance variable 0
    // whether static or non-static it has default values ;
    String s;
    boolean b;
    double d;
    UserDefine ud;
     static public void  main(String[] d) {
         int x; // local variable because inside method. no default value for local variables;
        System.out.println("Jay Shree Ram");
         System.out.println(a); //0
         _1InstaceVariableLocalVariable object=new _1InstaceVariableLocalVariable();
         System.out.println(object.s); // null and it is same for all the user define variable
         System.out.println(object.b); // false
         System.out.println(object.d); //0.0
         System.out.println(object.ud); // null
    }
}
class UserDefine{

}