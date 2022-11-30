package JA111.sprint3.day1.pre;

public class Dog extends Animal{

    // child class is not satisfied with parent class method the
    // child class can override parents class method.

    @Override
        // if you write method name it will become method instead overide
    // to avoide this error @Override annotation highly recomended.

    void eat(){
        System.out.println("I am dog and eating meat");
    }
    void bark(){
        System.out.println("I am barking");
        super.eat();
    }
    public static void main(String[] args) {
//        Dog dog=new Dog();
        // over ridding child get priority or over rid get priority
//        dog.eat();
//        dog.bark();

        Animal a=new Dog();  // Up casting child to parent
        a.age=20;
        System.out.println(a.age);
        a.eat(); // overrid child class method is called. child get prority always
//        a.bark() you can't class others method or var child. but you can class all the method
        // var of parent and while calling overridden method child get priority.

        Dog d= (Dog) a; // downcasting you can access any child class element by object b now.
        // downcasting is only possible when upcasting is there otherwise you will get class cast exception at run time.
    }
}

// some time i need to call parent method which is overridden in this clas
// super.method it refers immidiate parent class object.
// while this was refering current class object.

// dynamic polymorphism or run time polymorphism
// which method will called in overring is decided at run time
// for this we use Super class reference and child class object
