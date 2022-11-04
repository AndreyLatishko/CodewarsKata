package sixkata;
import java.util.Arrays;
public class FindOutlier{
    static int find(int[] integers){
        int[] even = Arrays.stream(integers).filter(x -> x % 2 ==0).toArray();
        int[] odd = Arrays.stream(integers).filter(x -> x % 2 !=0).toArray();
        return odd.length < even.length ? odd[0] : even[0];
    }
}
