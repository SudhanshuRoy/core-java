package JA111.sprint3.day1.live;

public class _6HerarcialInheritance {
    public static void main(String[] args) {

    }
}
class Pet{
    void speak(){
        System.out.println("Pet is speaking");
    }
}
class Dog2 extends Pet{
    @Override
    void speak(){
        System.out.println("barking");
    }
}
class Cat2 extends Pet{
    @Override
    void speak(){
        System.out.println("meawing");
    }
}
//class child extends Cat2,Dog2{
//
//}

// when you will call speak with object of child compiler will get confuse whether it should meawing of barking
// this is diamond problem or that's why multi level inheritance is not allowed in java.