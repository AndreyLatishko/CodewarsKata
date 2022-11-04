package sixkata;


public class DRoot {
    public static int digital_root(int n) {
        if (n < 10)  return n;
        int result = 0;

        for (char c : Integer.toString(n).toCharArray()) {
            result += Character.getNumericValue(c);
        }


        return digital_root(result);
    }
}
