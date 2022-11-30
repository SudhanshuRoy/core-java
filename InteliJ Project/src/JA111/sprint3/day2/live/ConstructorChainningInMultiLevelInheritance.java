package JA111.sprint3.day2.live;

public class ConstructorChainningInMultiLevelInheritance {
    public static void main(String[] args) {
        Creta creta=new Creta();
        Object obj;
    }
}
class Vehical{
    Vehical(int a){
//        super();
        System.out.println("I am vehical");
    }
}
class HyundaiCar extends Vehical{
    HyundaiCar(int x){
        super(8);
        System.out.println("I am Hyuandai car");
    }

}
class Creta extends HyundaiCar{
    Creta(){
        super(5);
        System.out.println("I am creata");
    }
}

// Base class have reference of child child class then child class will get the priority