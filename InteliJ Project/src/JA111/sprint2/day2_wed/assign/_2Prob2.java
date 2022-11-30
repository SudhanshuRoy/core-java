package JA111.sprint2.day2_wed.assign;

public class _2Prob2 {
   static void primeFactor(int a){
       for(int i=1;i<=a;i++){
           if(a%i==0){
               System.out.print(i+" ");
           }
       }
    }
    public static void main(String[] args) {
        _2Prob2.primeFactor(16);
    }
}
