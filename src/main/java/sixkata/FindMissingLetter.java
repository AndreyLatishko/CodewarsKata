package sixkata;

import java.util.stream.IntStream;

public class FindMissingLetter {
    public static char findMissingLetter(char[] array)
    {
        int [] ints = new String(array).chars().sorted().toArray();

        int position = IntStream.range(1,ints.length)
                .filter(i -> (ints[i] - ints[i - 1] != 1))
                .findFirst()
                .getAsInt();

        return (char) (ints[position] - 1);
    }
}
