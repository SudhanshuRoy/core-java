/*
1. Point to super class of super class constructor we use super keyword.
2.

// uses of java super key word
1. super can be used to refer immediate parent class instance variable
2. super can be used to invoke immediate parent class method
3. super can be used to invoke immediate parent class constructor.

*** Constructor chaining
1. Compiler always provide default constructor to all the classes.
2.whenever you create any constructor on the first line of the constructor compiler insert "super() " which class parent default constructor.
2. If you are creating any constructor or parameterised constructor then default constructor won't be provided by compiler.
3. continue of point2: In that case if you are creating any constructor in child class of this class then you will have to write super() and pass appropriate parameter otherwise you will get error.

 */

package JA111.sprint3.day2.live;

public class _4SuperAndConstructorChainning {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.printColor();
       dog.eat();
    }

}
class Animal{
    String color="white";
    Animal(int a){
        System.out.println("Animal constructor");
    }
    void eat(){
        System.out.println("amimal eat");
    }
}
class Dog extends Animal{
    String color="black";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
    Dog(){
        super(5); // even if you will not use super constructor then also it will default constructor this is know as constructor chaining . child class constructor first invoke parent class constructor . if constructor is not available you will error.
        System.out.println("Dog Constructor");
    }
    @Override
    void eat(){
        super.eat();
        System.out.println("dog eats");
    }
    void bark(){
        System.out.println("dog is barking");
    }
        }