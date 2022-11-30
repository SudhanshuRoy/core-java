package live;
interface Animal{
    // by default an interface methods are abstract.
    void move();
}
abstract class Fish implements Animal{

}
class Dolphine extends Fish{
    @Override
    public void move(){
        System.out.println("I AM INSIDE DOLHINE CLASS");
    }
}

//class SnakePlant implements Animal{
//    public void move(){
//      System.out.println("I am Snake");
//    }
//}

public class _2MethodInInterface {
    public static void main(String[] args) {
      Dolphine dolphine= new Dolphine();
      dolphine.move();
        System.out.println(dolphine instanceof Animal);
        System.out.println(dolphine instanceof Fish);
        System.out.println(dolphine instanceof Dolphine);
    }
}

// Interfaces are blue prints so whenever you are implimenting in anyy concreat class then you have to
// impliments as per intrface only or you have to override all the abstract methods
// Snake plant class implimented animal class but it can't have but as per interface its concreat class have
//to override its methods

/*
Relationship between interface and classes
1. it has is a relation ship like inheritance exa: Dolphile is a Fish or Fish is a Animal.

*/
