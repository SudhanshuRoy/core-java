package JA111.sprint2.day4_fri.assign;
import java.util.Scanner;
public class _2WeatherApplication {
    boolean isSnowing;
    boolean isRaining;
    double temperature;
    void checkWeather(boolean isSnowing,boolean isRaining,double temperature){
        this.isSnowing=isSnowing;
        this.isRaining=isRaining;
        this.temperature=temperature;
        if( isSnowing || isRaining || temperature<50){
            System.out.println("Let’s stay home.");
        }else {
            System.out.println("Let’s go out!");
        }
    }
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter true/false of below ques:-");
        System.out.println("Is Raining?");
        boolean isRaining = scanner.nextBoolean();
        System.out.println("Is Snowing?");
        boolean isSnowing = scanner.nextBoolean();
        System.out.println("Enter temp in Fahrenheit");
        double temperature= scanner.nextDouble();
        _2WeatherApplication obj=new _2WeatherApplication();
        obj.checkWeather(isSnowing,isRaining,temperature);
    }
}
