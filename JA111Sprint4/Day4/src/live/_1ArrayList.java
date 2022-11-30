package live;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;


public class _1ArrayList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();  // variable size lis;

        List<Integer> anotherList= Arrays.asList(1,2,3,4);  // fixed size list list Arrays>asList():
        // convert list to array
        list.addAll(anotherList);
        System.out.println(list.contains(3));
        System.out.println(list.containsAll(anotherList));

        Object [] arr=list.toArray(); // concert list to array;


        Iterator<Integer> it=list.iterator();

        while (it.hasNext())
            System.out.println(it.next());
    }
}
// Initial capacity is 10 and load factor 0.75
// whenever you create list its size is 10 the if 75 % list is full it will be copied to another list of double size.