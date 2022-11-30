// Difference b/w iterable and iterator
/*1. both is interface and iterable is top in the herarchy of collection not iterator keep in mind
2. iterable has methods like iterator and forEach whereas iterator has method hasNext and Next;
3. all sub class of iterable override method of iterable
4. whereas iteratal is in has a relationship with collection.
5. With the help of iterator you can travel in forward but not in backward;
6. ListIterator extend iterator and with the help of list Iterator you can travel backward as well.
Note: only list has object of list iterator. set and queue don't have list iterator. but collecton has obj of iterator so list, set and que all can use it to travel forward.

list->1.iterable -> for each and iterator method, 2. Iterator -> hasNext and Next, 3. ListIterator
set->1. iterable-> for each and iterator method , 2. Iterator -> hasNext and Next

7. Vector was in java 1.0 and collection frame work came in 1.2  so vector has a extra way to travel vector
which is obj of Enumerator Interface
Note: iterable has forEach method and there is foreach(came in 1.8) loop as well which is different things.
// You can see class can't extend interface;

*/



package democollection;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
// iterable interface
interface it{
     void nxt();
     void hsNxt();
}


// collection interface extend iterable
interface coll extends it{
    it iter = new it() {
        @Override
        public void nxt() {
            System.out.println("Jay Shree Ram !!");
        }

        @Override
        public void hsNxt() {

        }
    };
    void add();
    void remove();
    void contains();
}
// list interface extend collection
interface lst extends coll{
    int index=0;
    void lstMethod();

}
// set interface extends collection
interface st extends coll{
    void stMethod();
}
// linkList implements list interface and override all its method and its all super class's method
class lnklst implements lst{

    @Override
    public void nxt() {

    }

    @Override
    public void hsNxt() {

    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void contains() {

    }

    @Override
    public void lstMethod() {

    }
}
// hasSet class impliments set interface and override all its method and its super class method
class hsst implements st{

    @Override
    public void nxt() {

    }

    @Override
    public void hsNxt() {

    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void contains() {

    }

    @Override
    public void stMethod() {

    }
}

public class _1UnderstandChain {
    public static void main(String[] args) {
        // now you can create object of lnklst of hsset to use this herarchy
        hsst st=new hsst();
        lnklst lnklst=new lnklst();
        // or you can use reference of their parent
        coll obj=new lnklst(); // I can class any method of coll but can't call method of lnklst;
        // coll's method which is overriden in child get called;

        // obj.lstMethod();  run time polymorphsm in ref of parent can't call child class method
        obj.add();
        obj.remove();
      it it=  obj.iter;
      it.hsNxt();
      it.nxt();


        lnklst obj2=new lnklst();
        obj2.lstMethod();
        it it1=obj2.iter;
        it1.nxt();
        it1.hsNxt();


    }
}

// has a relationship between iterable and collection i.e, collection contains obj of iterable,
// and you use as explained in above example