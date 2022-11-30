package JA111.sprint1._2thu;

public class _TypeCasting {
    public static void main(String[] args) {
        byte b=10;
        int i=b;
        System.out.println(i);
        int z=2;
        byte y=(byte)z;

//        byte p= (byte) (b+1);
        float f=(float) 10.5;

        byte p=1;
        byte q=2;
       int r=  (p+q); // max(int,type of a, type of b)
    }
}
