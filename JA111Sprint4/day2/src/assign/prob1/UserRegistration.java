package assign.prob1;
import java.util.Scanner;
public class UserRegistration {
    void registerUser(String username,String userCountry){
        try {
            if(userCountry.equals("India")){
                System.out.println("User registration done successfully");
            }else{
                throw new InvalidCountryException("User Outside India cannot be registered");

            }
        }
       catch (InvalidCountryException exception){
           System.out.println(exception.getMessage());
       }
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

        System.out.println("Enter your Name : ");
        String name=sc.nextLine();
//        sc.nextLine();
        System.out.println("Enter your Country : ");
        String country=sc.nextLine();
        UserRegistration obj=new UserRegistration();
        obj.registerUser(name,country);
    }
}
