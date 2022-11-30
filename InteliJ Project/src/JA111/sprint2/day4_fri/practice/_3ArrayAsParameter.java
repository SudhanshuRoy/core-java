package JA111.sprint2.day4_fri.practice;

public class _3ArrayAsParameter {
    public static void main(String[] args) {
_3ArrayAsParameter obj=new _3ArrayAsParameter();
int [] nums={4,28,9};
int max=obj.largestElement(nums);
        System.out.println(max);
    }
    int largestElement(int [] nums){
        int max=Integer.MIN_VALUE;
        if(nums.length==0){
            System.out.println("Array is Empty");
        }
        for(int i=0;i<nums.length;i++){
           if(nums[i]>max){
                max=nums[i];
}
        }
        return max;
    }

}
