package sixkata;
import static java.util.Arrays.stream;
public class FindOdd {
    public static int findIt(int[] a) {

        return stream(a).reduce(0,(x,y) -> x ^ y);
    }
}
