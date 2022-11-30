package JA111.sprint3.day1.assign.Prob1;

public class Bird {
    public void fly(){
        System.out.println("Bird is flying");
    }

}
class Parrot extends Bird{
    public void fly(){
        System.out.println("I am Flying");
    }
    public void sing(){
        System.out.println("I am Singing");
    }
}

