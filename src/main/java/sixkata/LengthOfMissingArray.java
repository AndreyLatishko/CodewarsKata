package sixkata;

import java.util.Arrays;

public class LengthOfMissingArray {
    public static int getLengthOfMissingArray(Object[][] inputArray)
    {
        if (inputArray == null || inputArray.length <=0) return 0;

        int[] arrayOfSizes = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] == null ||inputArray[i].length == 0) return 0;

            arrayOfSizes[i] = inputArray[i].length;
        }

        Arrays.sort(arrayOfSizes);
        for (int i = 0; i < arrayOfSizes.length-1; i++) {
            if(arrayOfSizes[i+1] - arrayOfSizes[i] - 1 != 0) {
                return arrayOfSizes[i] + 1;
            }
        }
        //сравнение элементов в одном массиве, с возвращение отсуствуещего между ними элемента

        return 0;
    }
}
