package live.ExceptionHandeling;

public class _6FinallyBlockNotExecuted {
    public static void main(String[] args) {
        try{
            System.out.println("Try");
            System.exit(1);
        }
        finally {
            System.out.println("Finally");
        }
    }
}
