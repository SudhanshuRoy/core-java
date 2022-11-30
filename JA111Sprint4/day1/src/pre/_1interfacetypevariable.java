/*Difference b/w default method and static method
1. both have body inside the interface only
2. concrete class which inherit default method automatically no need to even override and you can
call this default method with the help of its obj
     but concrete class can't inherit static method you have to by by interface name.
3.
*/


package pre;

public class _1interfacetypevariable {
    CustorInterface x;
    public static void main(String[] args) {
        _1interfacetypevariable obj=new _1interfacetypevariable();
        Concret concret=new Concret();
        obj.x=concret;
        System.out.println(obj.x);

        concret.method();
        // we can't create interface obj so we can't assign interface obj but we can assign concreat
//        class obj which implements that interface

        CustorInterface.func1();// static method inside the interface must have body and called by with the name ot interface only.
        concret.myMethod();
    }
}

interface CustorInterface{
    void myMethod();
default void method(){
    System.out.println("I am default method of interface and I have body as well");
}
static void func1(){
    System.out.println("I am static method inside the interface");
}
}
class Concret implements CustorInterface{
    @Override
    public void method() {
//        CustorInterface.super.method();
        System.out.println(" I am abstract method inside the Custom  interface");
    }

    public void myMethod(){

 }
}