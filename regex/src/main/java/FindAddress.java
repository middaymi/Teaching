import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAddress {

    public static boolean test(String testString) {
        Pattern p = Pattern.compile(".+\\.(com|ua|ru)");
        Matcher m = p.matcher(testString);
        return m.matches();
    }

    public static void main(String[] args) {
        System.out.println(test("trololo.com"));
        System.out.println(test("trololo.ua "));
        System.out.println(test("trololo.ua"));
        System.out.println(test("trololo/ua"));
        System.out.println(test("i love java because it is cool.ru"));
        System.out.println(test("BACON.ru"));
        System.out.println(test("BACON.de"));
    }
}
