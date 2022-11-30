package JA111.sprint3.day2.assign.prob3;
import java.util.Scanner;
public class Demo {
    public Hotel provideFood(int amount){
        if(amount>1000){
            return new TajHotel();
        }else if(amount>200 && amount<1000){
            return new RoadSideHotel();
        }else {
            System.out.println("Please Enter a valid amount");
            return new Hotel();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount");
        int amount=sc.nextInt();
        Demo demo=new Demo();
        System.out.println(demo.provideFood(amount));
    }
}
