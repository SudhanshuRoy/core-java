package live.ExceptionHandeling;

public class _4NestedTryBlocks {
    public static void main(String[] args) {
        try{
            try {
                try {
                    int [] arry={1,2,3,4,5};
                    System.out.println(arry[8]);
                }catch (ArithmeticException AE){
                    System.out.println("Inner one Catch Block : "+AE.getMessage());
                }
            }catch (ArrayIndexOutOfBoundsException AI){
                System.out.println("Middle One Catch Block : "+AI.getMessage());
            }
        }catch (Exception e){
            System.out.println("Outer One Catch Block : "+e.getMessage());
        }
    }
}
