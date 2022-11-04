package sixkata;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        Map < Character, Long > collect = text
                .toLowerCase()
                .chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        Collection<Long> result = collect.values().stream()
                .filter((Long i) -> i > 1)
                .collect(Collectors.toList());

        return  result.size();
    }
}
