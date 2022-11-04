package sixkata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhoneNumber {
    public static boolean validPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("^(\\(\\d{3}\\))( )\\d{3}-\\d{4}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
