package sixkata;
import java.lang.StringBuilder;
 public class toCamelCase {
    private static final String regex = "([^a-zA-Z']+)'*\\1*";

    static String toCamelCase(String s) {
        String[] split = s.split(regex);
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            if (i == 0) {
                stringBuilder.append(split[i]);
            } else if (split[i].length() > 0) {
                stringBuilder.append(split[i]
                        .replaceFirst(split[i].substring(0,1),split[i].substring(0,1).toUpperCase()));
            }
        }
        return new String(stringBuilder);
    }
}