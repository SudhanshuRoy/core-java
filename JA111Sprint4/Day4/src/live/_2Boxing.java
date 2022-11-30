package live;

public class _2Boxing {
    public static void main(String[] args) {
        // outboxing , unboxing
        int x=10;
        Integer wrapperInt=Integer.valueOf(x);
        // same
        Integer autoBoxedInt=x;

        // unboxing
        //wrapper to prim
        int primInt=wrapperInt.intValue();
//        same as
    }
//    int primInt2=wrapperInt;
}
// wrapping to wrapper class is boxing
// converting wrapper to primitive is unboxing
