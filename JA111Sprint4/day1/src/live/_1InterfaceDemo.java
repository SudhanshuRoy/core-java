package live;

public class _1InterfaceDemo {
    public static void main(String[] args) {
        StudentOfMasai student=new StudentOfMasai();
        System.out.println(MasaiStudentContract.fee); // static method of field by interface name only accessible
    }
}

// interface (10% abstraction) => abstract class (partial abstraction in between o to 100) => concrete class(0% abstraction)
interface MasaiStudentContract{
    public static final double fee=300000;
    // by default all the interface variables are public, static and finla
}
class StudentOfMasai implements MasaiStudentContract{

}