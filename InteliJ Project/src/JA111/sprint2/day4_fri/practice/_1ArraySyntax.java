//Except premetive data types all the wrapper class of userdefine class have by default null value.
// int [] arr=new int[5] //[0 0 0 0 0]
// Integer [] arr =new Integer[5] // [null null null null null]

package JA111.sprint2.day4_fri.practice;

public class _1ArraySyntax {
    public static void main(String[] args) {
        int [] num;
        num=new int[10];
        for(int i=1;i<=num.length;i++){
            num[i-1]=i;
        }
        System.out.println(num);

        // Another way to declear array
        String [] names={"sudhanshu Roy","pankaj tiwari","ram lakhan","jay shree ram"};
        System.out.println(names);
        for(int i=0;i<names.length;i++){
//            System.out.print(names[i]+" ");
        }

        // for each loop or enhanced for loop
        // systax;
        // for(datatype_of_array  name_of_variable: name_of_array)
        for(int ele:num){
            System.out.print(ele+" ");
        }
    }
}
