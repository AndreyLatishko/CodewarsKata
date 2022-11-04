package sixkata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> integers = new ArrayList<>();
        Map<Integer, Integer> count = new HashMap<>();
        for (int i : elements) {
            count.compute(i, (k,v)-> v == null ? 1 : v + 1);
            if (count.get(i) <= maxOccurrences) {
                integers.add(i);
            }
        }
        return integers.stream().mapToInt(a->a).toArray();
    }

}
