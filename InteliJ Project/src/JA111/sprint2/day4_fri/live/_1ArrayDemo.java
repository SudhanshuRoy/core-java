package JA111.sprint2.day4_fri.live;

public class _1ArrayDemo {
    public static void main(String s[]){
        // syntex for decleration
        // <datatype> [] <array_name>
        int [] ages;
        // syntax for creatng a array
        ages=new int[10]; // 40 bytes allocated;
        // another way to create array
        String[] names=new String[10];
        System.out.println(ages); // address of obj of array ages
       Integer[] integers=new Integer[5];
        integers[0]=10;
        for(int i=0;i<integers.length;i++){
            integers[i]=i;
            System.out.println(integers[i]);
        }

        // another way of creating array
//        String arr= {"one","two","three"};

        // syntax of foreach : for(<datatypes> loop_var :name of array){
        // sout(loop_var
        for(int nameCanBeAnything:ages){
            System.out.println(nameCanBeAnything);
        }
    }
}
