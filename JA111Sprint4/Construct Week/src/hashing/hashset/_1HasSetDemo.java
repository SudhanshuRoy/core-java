package hashing.hashset;
import java.util.HashSet;
//import java.util.ArrayList;
import java.util.Iterator;
public class _1HasSetDemo {
    public static void main(String [] args){
        HashSet<Integer> hashSet=new HashSet<>();
//        ArrayList<Integer> arrayList=new ArrayList<>();
       hashSet.add(1);
       hashSet.add(2);
       hashSet.add(3);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);
        hashSet.add(9);
       hashSet.add(4);
       hashSet.add(5);
       hashSet.add(15);




        System.out.println("Size of the hash set is : "+hashSet.size());
       if(hashSet.contains(3)){
           System.out.println("Yes my hashset contains 3");
       }
       if(!hashSet.contains(6)){
           System.out.println("MY hashset doesn't contain 6");
       }
       hashSet.remove(1);
       if(!hashSet.contains(1)){
           System.out.println("I removed 1");
       }
       System.out.println(hashSet);

      //Iterator of hash set
        Iterator it=hashSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
