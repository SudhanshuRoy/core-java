package live.ExceptionHandeling;

public class _2NumberFormateException {
    public static void main(String[] args) {
        System.out.println("Program starts");
        int [] arr={1,2,3,4,5,6};
        String s="1234";
        try {

            Integer i=Integer.parseInt(s);
            System.out.println("Hello");

        }catch (NumberFormatException exception){
            System.out.println(exception);
        }

        try {
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array Index Out of Bounds Exception");
            System.out.println(exception);
        }

        System.out.println("Program Ends");
    }
}
