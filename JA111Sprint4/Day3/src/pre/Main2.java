

package pre;
import java.util.ArrayList;
public class Main2 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(5);
        al.add("Sudhanshu Kumar");
        al.add(true);
        al.add(new Student("Sudhanshu Kumar",01,500));

        String name=(String) al.get(1);
        int roll=(Integer)al.get(0);


        System.out.println(al.get(1));

    }

}
