package live;
import java.util.Scanner;
//import javax.management.MBeanAttributeInfo;
//import javax.swing.text.rtf.RTFEditorKit;

public class _9EnumSwithcCase {

        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);

                Color color=Color.BLUE;
                switch (color){
                        case RED -> System.out.println("Red");
                        case BLUE -> System.out.println("Blue");
                        case BLACK -> System.out.println("Black");
                        case YELLOW -> System.out.println("Yellow");
                }
        }
}
enum Color{
        RED,
        BLACK,
        BLUE,
        YELLOW;
}