package JA111.sprint2.day4_fri.assign;

public class _4Student {
    int roll;
    String name;
    int marks;
    void displayStudentDetails(int roll,String name,int marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
        System.out.println("Roll is: "+this.roll);
        System.out.println("Name is: "+this.name);
        System.out.println("Marks is: "+this.marks);
    }
    public static void main(String[] args) {
      _4Student s1=new _4Student();
      _4Student s2=new _4Student();
      s1.displayStudentDetails(12,"Ram",200);
      s2.displayStudentDetails(10,"Madhav",400);
    }
}
