package live;

import java.util.ArrayList;

public class _3WeProblem {
    public static void main(String[] args) {
       ArrayList<Student> students=new ArrayList();
        Student s1=new Student("Sudhanshu",01,100);
        Student s2=new Student("sonu",05,200);
        students.add(s1);
        students.add(s2);
        for(Student element:students){
            System.out.println(element);
        }
    }
}
