package sixkata;

import java.util.stream.IntStream;

public class PangramChecker {
    private static final int DIGIT_ACSII_FIRST = 65;
    private static final int DIGIT_ACSII_LAST = 91;
    public boolean check(String sentence){
        return IntStream.range(DIGIT_ACSII_FIRST, DIGIT_ACSII_LAST)
                .noneMatch(x -> sentence.toUpperCase().indexOf(x) < 0);
    }
}