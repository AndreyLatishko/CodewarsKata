package sixkata;

import java.util.Arrays;

public class findUniqe {
    public static double findUniq(double arr[]) {
        return Arrays.stream(arr).distinct()
                .filter(a -> Arrays.stream(arr)
                        .filter(b -> a ==b)
                        .count() == 1)
                .reduce((a,b) -> {throw new IllegalArgumentException();}).getAsDouble();
    }
}
