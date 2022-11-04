package sixkata;

import java.util.Arrays;

public class SortedOdd {
    public static int[] sortArray(int[] array) {
        final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

        for (int j = 0, s = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
        }

        return array;
    }
}