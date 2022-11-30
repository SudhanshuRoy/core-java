package JA111.sprint2.day2_wed.pre;



public class _1HasARelationship {

//    Demo d=new Demo();
    // Object of other class as a instance member is Has-A-Relationshilp
    // along with instanciation d got default value

    Demo d; // d is the reference variable and its default value is null so you can't access any field of Demo by d
    // otherwise you will get null point exception at run time.
    int curr;
    public static void main(String[] args) {
       _1HasARelationship r=new _1HasARelationship();
        System.out.println(r.d);
        r.d=new Demo(); // solution of run time null point exception
       r.d.demo();
    }
}
