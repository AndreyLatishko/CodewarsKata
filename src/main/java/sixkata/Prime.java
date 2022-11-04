package sixkata;

import static java.math.BigInteger.valueOf;

public class Prime {
    public static boolean isPrime(int num) {
        return num > 1 && valueOf(num).isProbablePrime(10);
    }
}
