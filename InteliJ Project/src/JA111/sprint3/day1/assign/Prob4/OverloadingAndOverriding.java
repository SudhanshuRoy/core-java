/*Q4) Explain the difference between overloading and overriding methods with an example?

1.Overloading: Method name is same but different number of parameter of data types of parameter's should be different then you can call same method by passing different no of parameter of parameter of different types.
it is also know as compile time polymorphism because while calling method you know which method will be called.

2.If signature of two method is same and their class's have parent and child relationship then child class method is overloaded parent class method.

Explanation of below code:
run method is overloaded in vehicle class whereas first run method with one parameter is overloaded in car class. I created obj of car in the reference of vehicle so I can call any member of vehicle class and called run method which has two parameter. But when I call run method of which has one parameter which is overridden
in car class child get priority and called run method of child class this is also know as run time polymorphism.
*/

package JA111.sprint3.day1.assign.Prob4;

public class OverloadingAndOverriding {
    public static void main(String[] args) {
        Vehicle vehicle=new Car(); //Up casting
        Car car=(Car) vehicle; // down casting
        vehicle.run(20,120);
        vehicle.run(90);
    }
}
class Vehicle{
    void run(int maxSpeed){
        System.out.println("Vehicle is Running with max speed: "+maxSpeed);
    }
    void run(int maxspeed,int minSpeed){
        System.out.println("Vehicle is Running with max speed: "+maxspeed+", Vehicle is running with min speed: "+minSpeed);
    }
}
class Car extends Vehicle{
    @Override
    void run(int maxSpeed){
        System.out.println("Car's max speed"+maxSpeed);
    }
}