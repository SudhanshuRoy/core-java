package democollection;
import java.util.ArrayList;
import java.util.Arrays;

public class _4TravelsExample {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for(Integer ele:list){
//            System.out.println(ele+" ");
            StringBuilder br=new StringBuilder(ele);
            System.out.print(br.reverse()+" ");
        }
    }
}
