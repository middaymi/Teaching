import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class MatcherAndFind {
    public static void main(String[] args) {

        String regexForDigits = "\\d+";
        String regexForNumber = "[-()]+";
        String errorRegex = "(\"},{\")";

        String good = "456789";
        String bad = "456789g";
        String chars = "me111me789count!me";
        String number = "+7(985)319-33-17";
        String errorExample = "{one}, {two}, {three}";

        Pattern patternForDigits = Pattern.compile(regexForDigits);
        Pattern patternForNumber = Pattern.compile(regexForNumber);

        Matcher matcherGood = patternForDigits.matcher(good);
        Matcher matcherBad = patternForDigits.matcher(bad);
        Matcher matcherChars  = patternForDigits.matcher(chars);
        Matcher matcherNumber = patternForNumber.matcher(number);

        System.out.println("<matcher object>");
        System.out.println(matcherGood);
        System.out.println(matcherBad);

        System.out.println("\n<find>");
        System.out.println(matcherGood.find());
        System.out.println(matcherBad.find());

        System.out.println("\n<matches>");
        System.out.println(matcherGood.matches());
        System.out.println(matcherBad.matches());

        System.out.println("\n<find and print digits>");
        while(matcherChars.find()) {
            System.out.println(matcherChars.group());
        }

        System.out.println("<replace useless in number>");
        System.out.println(matcherNumber.replaceAll(""));


        try {
            Pattern patternError = Pattern.compile(errorRegex);
            String[] matcherError = patternError.split(errorExample);
            System.out.println(matcherError);
        } catch (PatternSyntaxException ex) {
            System.out.println("\nerror");
            System.out.println(ex.getDescription());
            System.out.println(ex.getIndex());
            System.out.println(ex.getPattern());
            System.out.println(ex.getMessage());
        }

    }
}
