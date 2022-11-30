// Generic ArrayList

package pre;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("Sudhanshu Kumar",01,100));
        students.add(new Student("Raj Parsac",02,200));
        Student sudhanshu=students.get(0);
        System.out.println(sudhanshu);
    }
}
