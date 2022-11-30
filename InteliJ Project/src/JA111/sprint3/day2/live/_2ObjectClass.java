package JA111.sprint3.day2.live;

import JA111.sprint2.day4_fri.live.Student;

public class _2ObjectClass {
    public static void main(String[] args) {
        Object object;
        MyClass myClass=new MyClass();
        System.out.println(myClass);
        Student student=new Student("Sudhanshu Roy");
        System.out.println(student);
        Student[] students={student,new Student("Gaurav Kumar Soni")};
        for(Student st:students){
            System.out.println(st);
        }
    }
}
class MyClass {
    String message="How have you been?";
    @Override
    public String toString(){
        return message;
    }
}
