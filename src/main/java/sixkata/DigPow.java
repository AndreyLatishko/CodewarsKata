package sixkata;

public class DigPow {

    public static long digPow(int n, int p) {
        if (n > 0) {
            String str = n + "";
            int strLength = str.length();

            long sum = 0;
            for (int i = 0; i < strLength; i++) {
                int y = Integer.parseInt(str.substring(i, i + 1));
                sum += Math.pow(y, (p + i));
                if (sum % n == 0) {
                    return sum / n;
                }
            }
        }
        return -1;
    }
}

