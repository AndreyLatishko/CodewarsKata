package fivekata;

public class Zeros {
    public static int zeros(int n) {
        return (n < 5) ? 0 : (n / 5) + zeros(n / 5);
    }
}
