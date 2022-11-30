// constructor can't be static because static is related to class whereas constructor is used to create obj
// so constructor is related to object only so you can't mess with class and object.

// constructor doesn't have any return type and it's name is same as class name always
// every class has default constructor provided by compiler and because of its invocation object is created

// But you can access modifiers to constructor
// whenever you are creating parameterized constructor create a default constructor along with it.
package JA111.sprint2.day2_wed.live;

public class _8Constructor {
    public static void main(String[] args) {
MyClass mc=new MyClass();

    }
}
class MyClass{
    MyClass(){
        System.out.println("I am default consturctor");
    }
    MyClass(int a){
        System.out.println("I am parameterized consturctor"+a);
    }
}
