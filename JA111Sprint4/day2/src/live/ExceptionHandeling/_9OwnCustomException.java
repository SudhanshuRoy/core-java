package live.ExceptionHandeling;
import java.util.Scanner;
public class _9OwnCustomException {
    public static void main(String[] args) {
        try {
            validateEmail();
        } catch (DuplicateEmailException e) {
            e.printStackTrace();
        }
    }
    static void validateEmail() throws DuplicateEmailException{
        Scanner sc=new Scanner(System.in);
        String [] emails={"abc@gmail.com","xyz@gmail"};
        System.out.println("Enter your email id :");
        String email=sc.next();
        for(String eml:emails){
            if(email.equals(eml)){
                throw new DuplicateEmailException("This email already exist");
            }
        }
    }
}
class DuplicateEmailException  extends Exception{
    public DuplicateEmailException(String message){
        super(message);
    }

}