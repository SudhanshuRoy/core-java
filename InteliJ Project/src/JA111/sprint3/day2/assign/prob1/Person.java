package JA111.sprint3.day2.assign.prob1;

public class Person {
    String name;
    String gender;
    Address address;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                '}';
    }
}
class Instructor extends Person{
     int instructorId;
      int salary;

    public Instructor(int instructorId, int salary,Address address) {
        this.instructorId = instructorId;
        this.salary = salary;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "instructorId=" + instructorId +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
class Student extends Person{
      int studentId;
      String courseEnrolled;
      int courseFee;

    public Student(int studentId, String courseEnrolled, int courseFee,Address address) {
        this.studentId = studentId;
        this.courseEnrolled = courseEnrolled;
        this.courseFee = courseFee;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", courseEnrolled='" + courseEnrolled + '\'' +
                ", courseFee=" + courseFee +
                ", address=" + address +
                '}';
    }
}
class Address{
String city;
String state;
String pinCode;

    public Address(String city, String state, String pinCode) {
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
class main{
    public static Person generatePerson(Person person){
        return  person;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Address address=new Address("Gurugram","Hariyana","12207");


        Student student=new Student(97,"Full Stack Java",300000,address);


        Instructor instructor=new Instructor(04,90000,address);


       Person newStudent= generatePerson(student);
       Person newInstructor =generatePerson(instructor);
        System.out.println(newStudent);
        System.out.println(newInstructor);
    }
}