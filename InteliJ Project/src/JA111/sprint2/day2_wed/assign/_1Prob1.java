package JA111.sprint2.day2_wed.assign;

import java.util.Scanner;

public class _1Prob1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter city name: ");
        String city =sc.next();

        switch (city) {
            case "Mumbai":
                System.out.println("Financial city");
                break;
            case "Kolkata":
                System.out.println("City of Joy");
                break;
            case "Delhi":
                System.out.println("Capital of the country");
                break;
            case "Bangalore" :
                System.out.println("Cyber City");
                break;

            default:
                System.out.println("May be Other Indian City");
                break;
        }
    }
}
