package JA111.sprint1._1wed;

public class Factorial {
    public static void main(String [] a){
        System.out.println("Factorial of given num is: "+ fact(6));
    }
    static int fact(int num){
        if(num==0 || num==1){
            return 1;
        }
        return num*fact(num-1);
    }
}
