import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PizzaFind {

    public static boolean test(String testString) {
        Pattern p = Pattern.compile("^.+");
        Matcher m = p.matcher(testString);
        return m.matches();
    }

    public static void main(String[] args) {
        System.out.println(test("pizza "));
        System.out.println(test("@pizza"));
        System.out.println(test("pizza3"));
    }
}
