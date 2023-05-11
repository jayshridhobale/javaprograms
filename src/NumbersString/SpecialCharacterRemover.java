package NumbersString;

//remove all the special character from the given string using java ?  input=Progr#am%m*in&gLan?#guage?
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class SpecialCharacterRemover {
        public static String removeSpecialCharacters(String input) {
            Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
            Matcher matcher = pattern.matcher(input);
            return matcher.replaceAll("");
        }

        public static void main(String[] args) {
            String input = "Progr#am%m*in&gLan?#guage?";
            System.out.println(removeSpecialCharacters(input));
        }
}
