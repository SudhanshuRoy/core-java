package JA111.sprint2.day2_wed.pre;

public class _3MethodWithReturnType {
    static int funx(){
        System.out.println("Jay shree Ram");
        return 5;
    }
    static Demo funcReturnObj(){
        Demo d=new Demo();
        return d;
    }
    public static void main(String[] args) {
        System.out.println(funx());
        Demo dd=funcReturnObj();
        System.out.println(dd);
        dd.demo();  // with the help of this returned you can access  this class members.
    }
}
