package live;

public class _4RealtioshipBnCassesAndInterfaces {
    // class extends another class
    // class implements interface
    // interface extends interface

}
interface  AnimalInterface{
    void eat();
}
//extends AnimalInterface
interface BirdInterface {
    void fly();
}
class  Eagle implements BirdInterface,AnimalInterface{
    @Override
    public void eat(){
        System.out.println("eagle eats");
    }
    @Override
    public void fly(){
        System.out.println("fly high");
    }
}

// Relation between a concrete class and interface= "is a" realtionship
