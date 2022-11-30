package pre;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class _2Main1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[^0-9]");
        Matcher m = p.matcher("a7b@z#9");
        while (m.find()) {

            System.out.println(m.start() + "-------" + m.group());
        }
    }
}


