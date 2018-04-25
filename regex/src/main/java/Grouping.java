import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Grouping {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("(якороль).+(\\1)");
        Matcher m = p.matcher("это круто РВ это круто якороль Я СЕГОДНЯ ЕЛ БАНАНЫ якороль РВ");
        if(m.find()){
            System.out.println(m.group());
        }
    }
}
