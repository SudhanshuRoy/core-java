package live;

public class _7EarlyLateBinding {
    public static void main(String[] args) {
        Parent parent=new Parent();
        Parent p;
        p=new Child();
        p.hi();

        EarlyBinding earlyBinding=new EarlyBinding();
        earlyBinding.hi(); // early binding of static binding we know the result at compile time no confusion.
    }
}
class Parent{
void hi(){
    System.out.println("hii..");
}
}
class Child extends Parent{
    @Override
    void hi(){
        System.out.println("hii..");
    }
}
class EarlyBinding extends Parent{
    @Override
    void hi(){
        System.out.println("hii..");
    }
}

// compile time polymorphism is early binding
// run time polymorphism is late binding