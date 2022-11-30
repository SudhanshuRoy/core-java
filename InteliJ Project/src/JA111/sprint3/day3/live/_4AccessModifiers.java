package JA111.sprint3.day3.live;

public class _4AccessModifiers {
    public static void main(String[] args) {
        ClassWithPrivateVar obj=new ClassWithPrivateVar();
        System.out.println(obj.anInt);
        System.out.println(obj.getAnInt());

        // private: available only within the class.
    }
}
class  ClassWithPrivateVar{
 protected int anInt=10;

    public int getAnInt(){
      return anInt;
    }
}
class Fimily{

}