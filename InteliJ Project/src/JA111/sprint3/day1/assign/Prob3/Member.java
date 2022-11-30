package JA111.sprint3.day1.assign.Prob3;

public class Member {
    String Name;
    int Age;
    String Phone_number;
    String Address;
    double Salary;
    void printSalary(){
        System.out.println("Salary"+Salary);
    }
}
class Employee extends Member{
String Specialisation;
String Department;
}
class Manager extends Member{
    String Specialisation;
    String Department;
}
class Main{
    public static void main(String[] args) {
        Member member=new Manager();
        member.Name="Sudhanshu Roy";
        member.Age=24;
        member.Phone_number="7979099677";
        member.Address="Muzaffarur";
        member.Salary=500000;
        Manager manager=new Manager();
        manager.Name="Sudhanshu Kumar";
        manager.Age=26;
        manager.Phone_number="7979099677";
        manager.Address="Noida";
        manager.Salary=5000000;
        manager.Department="Banking Project";
        manager.Specialisation="Java Developer";
        System.out.println(member.Name);
        System.out.println(member.Age);
        System.out.println(member.Address);
        System.out.println(member.Salary);
        System.out.println(member.Phone_number);
        System.out.println(manager.Name);
        System.out.println(manager.Age);
        System.out.println(manager.Address);
        System.out.println(manager.Salary);
        System.out.println(manager.Phone_number);
        System.out.println(manager.Department);
        System.out.println(manager.Specialisation);
    }
}
/*Now, create a Main class which has the main method in it and assign name, age, phone
        number, address and salary to an employee and a manager by making an object of both of these
        classes and print the same.*/
