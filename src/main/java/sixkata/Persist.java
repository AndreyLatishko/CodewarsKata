package sixkata;

public class Persist {
    private static final  int oneDigitNumber = 10;
    public static int persistence(long n) {
        return persistenceResult(n,0);
        }
    public static int persistenceResult(long n, int count) {
        if(n < oneDigitNumber) {
            return count;
        } else {
            int result = 1;
            for(char c: Integer.toString((int) n).toCharArray()){
                result *= Character.getNumericValue(c);
            }
            return persistenceResult(result, ++count);
        }
    }
}
