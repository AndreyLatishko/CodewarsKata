package sixkata;

import java.util.stream.IntStream;

public class TwoSumKata {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
