package live;

public class _3weprob {
    public static void main(String[] args) {
        new FilePrinter().print();
        new ConsolePrinter().print();
        System.out.println();
        System.out.println();
    }
}
interface Printer{
    void print();
}
class FilePrinter implements Printer{
    @Override
    public void print(){
        System.out.println("printing file...");
    }
}
class ConsolePrinter implements Printer{
    @Override
    public void print(){
        System.out.println("printing console...");
    }
}