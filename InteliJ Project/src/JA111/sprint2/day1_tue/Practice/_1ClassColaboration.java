package JA111.sprint2.day1_tue.Practice;

public class _1ClassColaboration {
public static void main(String s []){
A a=new A();
//a.b.bb=22;
//if(a.b!=null) System.out.println(a.b.bb);
    //Remarks: Getting null point exception i.e default value of b is null and you are trying to access some things
    // form null that's why you are getting exception.
    // solution creat obj and assign reassign reference
    a.b=new B();
    a.b.bb=25;
    System.out.println(a.b.bb);
    a.b.method2();
}
}
class A{
    int aa;
    B b;
    void method(){
        System.out.println("I am inside classA&methodB");
    }
}
class B{
    int bb;
    A a;
    void method2(){
        System.out.println("I am inside classB&method2");
    }
}