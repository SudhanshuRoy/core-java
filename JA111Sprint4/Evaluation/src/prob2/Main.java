package prob2;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
      Main obj=new Main();
      List<Integer> list=new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);

        System.out.println(obj.metod(list,5));
    }
    int metod(List<Integer> list,int key){
      int count=0;
        for (int i : list) {
            if(i<key){
                count++;
            }
        }
        return count;
    }
}
