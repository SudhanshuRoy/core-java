/*// finally and final is completely different

* finally: In below code you can see clearly I didn't use catch and there is exception in code as well
even after that finally block will execute and I all te condition finally block executes.

*final: a. If a variable is final you can't reassign this variable.
        b. If a method is final you can't override it.
        c. If a class is final no class can inherit it.

        see in blow code every thing is explained properly
* */


package prob5;

public class C {
    public static void main(String[] args) {
        final  int x=100;
//        x=20;  final variable can't be reassigned.
        int a=20;
        int b=0;
        try {
           int z=a/b;
            System.out.println("Results : "+z);
        }
        finally {
            System.out.println("I am finally and execute all the time whether error occurs or not");
        }
    }
}
// Example final class can't be inherited by other class
final class A{

}
//class  B extends A{
//
//}

// Example final method can't be overridden

class Animal{
    final void finalMethod(){
        System.out.println(" I am final method and no one can override me");
    }
}
class Dog extends Animal{
    /*@Override
   void finalMethod(){
       System.out.println("I override finalMethod of Animal class");
   }*/
}