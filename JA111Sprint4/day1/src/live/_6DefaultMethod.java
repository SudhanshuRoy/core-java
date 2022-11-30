package live;

public class _6DefaultMethod {
    public static void main(String[] args) {

        Food dosa=new Dosa();
        dosa.dineIn();
        dosa.deliver(); // without implementation we can access default method  of interfce.
    }

}
interface Food{
    void dineIn();

    default void deliver()
    // suddenly add new method in interface then 10m java developr get affected that's why we use default key word to create default method, and it will get overridden by its subclass automatically.
            // it is known as backward compatible
    {

    }
    static void eat(){
        System.out.println("I am eating...");
    }
    // you can't make static method abstract because it related to class not to obj so, It must have body so
//    that you can call by class directly without even instatiation of class. it can't be overridden of implemented in child class.
//        whereas abstract means method without body and to define it you have to impliment and override in child class and with the help of child class obj you can access abstract method. so you can't make static as abstract.
}
class Dosa implements Food{
    @Override
    public void dineIn(){
        System.out.println("Serving Dosa...");
    }
}
class Idli implements Food {
    @Override
    public void dineIn() {
        System.out.println("Serving Idle..");
    }
}