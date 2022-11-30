
/*Q2) What is the use of ‘super’ keywords in java ? Explain with an example.
Ans: 1. Super key word refer to immediate parent class object.
     2. Super() key word also invoke constructor of immediate parent class.

example:1. In below example you can clearly see, I clearly see I called child method of Child class of and with the help
of super parent class method is also called.
 2. I just created child class object but constructor of parent class and grandparent class is automatically invoked.
 3. Actually compiled provide super at the first line of all the constructor to invoke default constructor, and You can
 write by your self for parameterised constructor.
 */

package JA111.sprint3.day2.assign.prob2;


public class SuperKeyWord {
    public static void main(String[] args) {
        Child child=new Child();
        child.child();
    }
}

class GrandParent{
    GrandParent(){
        System.out.println("I am constructor of GrandParent");
    }
  void grandParent(){
      System.out.println("I am grand parent method");
  }
}
class Parent extends GrandParent{
    Parent(){
        System.out.println("I am constructor of Parent");
    }
    void parent(){

        System.out.println("I am parent class method");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("I am child class Constructor");
    }
    void child(){
        super.grandParent();
        System.out.println("I am child class method");
    }
}