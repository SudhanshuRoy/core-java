package JA111.sprint2.day2_wed.live;

public class _6Polymorphism {
    public static void main(String[] args) {
Sum sum=new Sum();
 sum.add(1,2,3);
 byte x=5;
 sum.squre(x);
    }
}
class Sum{

    // static binding or compile time polymorphism of method overloading.
    int add(int x,int y){
        return x+y;
    }
    int add(int x,int y,int z){
        return x+y+z;
    }
    String add(String str){
        return str;
    }

    int squre(int a){
        System.out.println("I am Integer");
        return a*a;
    }
    byte squre(byte a){
        System.out.println("I am Byte");
        return (byte)(a*a);
    }

    // Either argument Type should be different of no of parameter should be different.
    // only return type is diff but name and no of argument and argument data type is same the compiler get confuse
    // which method should be called.
}