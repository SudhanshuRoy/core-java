package live.ExceptionHandeling;

import live.Pack1.One;

public class _3TryMultiCatch {
    public static void main(String[] args) {
        int i=-1;
        int d=01;
        int [] array={1};
        One o=null;
//        System.out.println(o);
        try{
//            System.out.println(i/d);
//            System.out.println(array[i]);
            o.getName();
        }catch (ArithmeticException AE){
            System.out.println(AE);
        }catch (ArrayIndexOutOfBoundsException AI){
            System.out.println(AI);
        }catch (Exception e){
            System.out.println("Generic Exception : "+e);
        }
    }
}
