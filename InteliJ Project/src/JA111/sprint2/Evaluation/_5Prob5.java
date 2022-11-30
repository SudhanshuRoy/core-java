/*5. Write a function that doubles all the values inside the given
        integer array and returns the array with doubled values.
        Sample input and output:
        Input array {1,2,3,4}
        Output array {2,4,6,8}*/

package JA111.sprint2.Evaluation;

public class _5Prob5 {
    void func(int [] a){
for(int i=0;i<a.length;i++){
    a[i]=2*a[i];
    System.out.print(a[i]+" ");
}
    }
    public static <arr> void main(String[] args) {
        int [] arr={1,2,3,4};

        _5Prob5 obj=new _5Prob5();
        obj.func(arr);
    }
}
