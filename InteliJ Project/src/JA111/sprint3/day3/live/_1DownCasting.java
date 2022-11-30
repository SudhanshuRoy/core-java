package JA111.sprint3.day3.live;

public class _1DownCasting {
    public static void main(String [] args){
        String s="Jay Shre Ram";
        Object o=s;
//        System.out.println(s instanceof String);
//        System.out.println(s instanceof Object);

        Animal parent=new Dog(); //UpCasting
        parent.eat();
//        parent.bark();
        System.out.println(parent instanceof Animal);
        System.out.println(parent instanceof Dog);

        Dog dog=(Dog) parent;
        dog.bark();
        downCasting(parent);
       // If there is no up casting of if object is not instance of that class you can't cast. In above example parent is instance of both animal and dog that's why you could down caste.
        // But object is not result of upcasting you can't down caste

        Animal pureAnimal=new Animal();
        downCasting(pureAnimal);
        System.out.println("I am the last line of this program");
    }
   static void downCasting(Animal animal){
        if(animal instanceof Dog){
            Dog dog=(Dog) animal;
            System.out.println("Down Casted");
        }else{
            System.out.println("Kindly pass compatible type");
        }

    }
}
class Animal{
    void eat(){
        System.out.println("Animals eat");
        System.out.println("Down casted");
    }
}
class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Dogs eat");
    }
    void bark(){
        System.out.println("Dogs bark");
    }
}