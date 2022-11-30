package assign.prob4;

public class Test implements Intr{
    int count=0;
    @Override
   public int[] display(int p){
      int [] arr=new int[p];

      for(int i=2;i<=p;i++){
          if(checkPrime(i)){
              arr[count]=i;
              count++;
          }
      }
      return arr;
   }
   boolean checkPrime(int n){
     for(int i=2;i<n/2;i++){
         if(n==2){
             return true;
         }
         if(n%i==0){
             return false;
         }
     }
     return true;
   }
}
