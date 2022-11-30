package JA111.sprint3.day1.assign.Prob1;

public class Main {
    public static void main(String[] args) {
        Bird b1 = new Parrot();// up casting you can any members of parent class but in case of overriding child get priority child class overrided method will be called. you can't call any child class method except overrided method. for calling child class method you have to do downcasting.
        b1.fly();
        Parrot p1=(Parrot) b1; //down casting now with p1 you can call any members of child class.
        p1.sing();
    }
}


//with this b1 reference call the fly method of
//            Parrot
//and after downcasting this b1 reference to the
//            Parrot class object, call the sing method also

