package JA111.sprint3.day1.assign.Prob2;

public class Animal {
    public void makeNoise(){
        System.out.println("Animal making Noise");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void walk(){
        System.out.println("Animal is walking");
    }
}
class Dog extends Animal{
    public void makeNoise(){
        System.out.println("Barking...");
    }
}
class Cat extends Animal{
    public void makeNoise(){
        System.out.println("Meaw...");
    }
}
class Tiger extends Animal{
    public void makeNoise(){
        System.out.println("Raoring...");
    }
}
class Main{
    public static void main(String[] args){
      Animal[] animals=new Animal[3];
      Animal animal1=new Dog();
      Animal animal2=new Cat();
      Animal animal3=new Tiger();

      animals[0]=animal1; animals[1]=animal2; animals[2]=animal3;

      Dog dog=(Dog) animal1; Cat cat=(Cat) animal2; Tiger tiger=(Tiger) animal3;

      dog.makeNoise();
      dog.eat();
      dog.walk();

        cat.makeNoise();
        cat.eat();
        cat.walk();

        tiger.makeNoise();
        tiger.eat();
        tiger.walk();
    }
}
