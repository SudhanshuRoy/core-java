package JA111.sprint2.day1_tue.Practice;

public class Test {

    int x;
    Demo d;
//   Demo d=new Demo();

    public static void main(String[] args) {
//        Demo d=new Demo();
        Test t=new Test();
//        d.demo();

        System.out.println(t.x); //Default value of instance int variable is '0'
        System.out.println(t.d); // Default value of instance reference variable is 'null'

        // And this default value is provided by compiler when obj is created.
    }
}
