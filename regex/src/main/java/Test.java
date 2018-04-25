import java.util.Arrays;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(":|;");
        String[] animals = pattern.split("cat:dog;bird:cow");
        Arrays.asList(animals).forEach(animal -> System.out.print(animal + " "));

        if (Pattern.matches("^[0-9]+$", "82323458654")) {
            System.out.println("\ntrue matches");
        }
    }
}
