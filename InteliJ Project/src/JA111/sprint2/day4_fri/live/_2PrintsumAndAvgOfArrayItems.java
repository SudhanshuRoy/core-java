package JA111.sprint2.day4_fri.live;

public class _2PrintsumAndAvgOfArrayItems {
    public static void main(String[] args) {
        Integer[] integers=new Integer[10];
        integers[0]=10;
        for(int i=0;i<integers.length;i++){
            integers[i]=i+1;
//            System.out.println(integers[i]);
        }
        int sum=0;
        for(int i=0;i<integers.length;i++){
            sum+=integers[i];
        }
        int avg=sum/integers.length;
        System.out.println(sum+"\n"+avg);

//        int [] arr=new int[5];
//        Integer [] arr2=new Integer[5];
    }

}
