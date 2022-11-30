package JA111.sprint3.day1.live;
class Fish{
    void swim(){
        System.out.println("Fish is swimming");
    }
}
   class Dolphin extends Fish{
    void jump(){
        System.out.println("Dolphine is jumpping");
    }
   }
public class _3Inheritance {
    public static void main(String[] args) {
      Dolphin dolphin=new Dolphin();
      dolphin.swim();
      dolphin.jump();
    }
}
// Fish: parent class,super class,Base class
// Dolphin: child class, sub-class, derived class