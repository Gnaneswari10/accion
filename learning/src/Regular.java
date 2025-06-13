
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
    public static void main(String[] args) {
        String input = " hello world ";
        String regex = " hello world ";

        Pattern pa = Pattern.compile(regex , Pattern.CASE_INSENSITIVE);
        Matcher ma = pa.matcher(input);
       boolean matched = ma.matches();
        System.out.println( " Full msatch : " + matched);

    }
}
