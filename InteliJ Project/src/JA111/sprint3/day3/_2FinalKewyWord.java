package JA111.sprint3.day3;

public class _2FinalKewyWord {
    final  int i=10;
//   final int j;
//    i++;

    // You can't reassign any value to final variable.

}
 class  A{
    void non_final(){
        System.out.println("I am non-final method");
    }
    final void finalMethod(){
        System.out.println("I am final method");
    }
}
class B extends A{
//    void finalMethod(){
//        System.out.println("I am overriding final method");
//    }
}
// You can't reassign final variable
// You can't override final method
// You can't inherit any final class