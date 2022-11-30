package JA111.sprint3.day2.arrayassign.prob3;

public class PrimeNumber {
    public int[] findAndReturnPrimeNumbers(int[] inputArray){
//write the logic to iterate through the supplied inputArray and return array of prime
//        numbers
//if no prime number is found then return the empty array.

        int [] arr=new int[inputArray.length];
        int count=0;
        for(int i=0;i<inputArray.length;i++){
            if(isPrime(inputArray[i])){
                arr[count]=inputArray[i];
                count++;
            }
        }
        return arr;
    }
    boolean isPrime(int n){
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int[] inputArr = {10,12,5,50,11,14,15};
        int[] inputArr2={};
        PrimeNumber pn=new PrimeNumber();
      int [] result=  pn.findAndReturnPrimeNumbers(inputArr);
      if(result.length==0){
          System.out.println("Prime number not found in the supplied Array");
      }else{
          for(int i=0;i<result.length;i++){
              if(result[i]==0){
                  break;
              }
              System.out.println(result[i]);
          }
      }

    }
}
