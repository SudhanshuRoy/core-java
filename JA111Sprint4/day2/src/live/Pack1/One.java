package live.Pack1;

public class One {
   protected   void hi(){
       System.out.println("hi..");
   };
   public void getName(){
       System.out.println("My name is Sudhanshu Roy");
   }
}
class Three{
    public static void main(String[] args) {
        One o=new One();
        o.hi();

    }
    void meth(){};
}