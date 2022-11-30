package prob5;

public class D {
    public static void main(String[] args) {
        int age= 15;
        if(age >=18){
            System.out.println("You are eligible for Job");
        }else {
            try{
                throw new NotEligibleForJob("You are not eligible for job");
            }catch (NotEligibleForJob exception){
                System.out.println(exception.getMessage());
            }

        }

        try{
          method();
        }catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
        }
    }
   static void method () throws ArithmeticException{
        int a=10;
        int b=0;
        int c=a/b;
        System.out.println("Results: "+c);
    }
}
class  NotEligibleForJob extends RuntimeException{
    NotEligibleForJob(String massege){
        super(massege);
    }
}