package prob3;

public class Main {
    public static void main(String[] args) {
        fun();
    }
   static void fun(){
      try {
          int[] array= new int[10];
          array[11]=100;
          Object object =null;
          object.toString();
      }
      catch (ArrayIndexOutOfBoundsException exception){
          System.out.println(exception.getMessage());
      }
       catch (NullPointerException exception){
           System.out.println(exception.getMessage());
       }
      finally {
          System.out.println("the end");

      }

    }
}
