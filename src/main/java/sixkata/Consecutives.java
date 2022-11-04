package sixkata;
import java.util.LinkedList;
import java.util.List;

public class Consecutives {

    public static List<Integer> sumConsecutives(List<Integer> s) {
        LinkedList<Integer> result = new LinkedList<>(List.of(0));
        int prev = s.get(0);
        for(int i: s){
            if (prev == i) {
                result.addLast(result.removeLast() + i);
            } else {
                result.addLast(i);
                prev = i;
            }
        }
          return result;
    }

}
