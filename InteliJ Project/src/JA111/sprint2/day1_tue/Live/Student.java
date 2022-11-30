// One very important properties of static key word.
// make it universal or static make field universal same value everywhere

package JA111.sprint2.day1_tue.Live;

public class Student {
    String name;
    int age;
   static String batchName; // common for all the students assining for all separately is for all student obj is foolishness
    // that's why make it static is good choice;
    public static void main(String[] args) {
        Student s1=new Student();
        s1.age=24;
        s1.name="Sudhanshu Roy";
        s1.batchName="fw20";
//        Student.batchName="fw20";

        Student s0=new Student();
        s0.age=22;
        s0.name="Monu Kumar";
        System.out.println(s0.age+" "+s0.name+" "+s0.batchName);


        Student s2=new Student();
        s2.age=25;
        s2.name="Sonu Kumar";
        s2.batchName="fw19";
        System.out.println(s2.age+" "+s2.name+" "+s2.batchName);

        Student s3=new Student();
        s3.age=22;
        s3.name="Monu Kumar";
        System.out.println(s3.age+" "+s3.name+" "+s3.batchName);

        Student s; // Memory is not allocated for s because new is not used.
        System.out.println();

        System.out.println(s1.batchName);
        System.out.println(s0.batchName);// for any student batch is fw19 here because for whole class it
        // is pointing to fw19 only. it is changing as it down. bcz every time it get updated in class area.
        // class fields get updated in class area.
    }
}

// static related to class not to the object.
// whenever you set value of any static field it will become default until you override its value
// after overridding it will become default value for that object and all the obj below this object
// objects are basically stored in heap area but static members stored in class or static area and
// helps to save space as well . stored at once instead of for every obj in heap.