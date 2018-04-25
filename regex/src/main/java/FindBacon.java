import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindBacon {

    public static boolean test(String testString){
        Pattern p = Pattern.compile("^BACON$");
        Matcher m = p.matcher(testString);
        return m.matches();
    }

    public static void main(String[] args) {
        System.out.println(test("BACON"));
        System.out.println(test("  BACON"));
        System.out.println(test("BACON  "));
        System.out.println(test("^BACON$"));
        System.out.println(test("bacon"));
    }
}
