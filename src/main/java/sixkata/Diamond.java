package sixkata;

public class Diamond {
    private static final String diamondSymbol = "*";
    private static final String spaceSymbol = " ";

    public static String print(int n) {
        if (n <= 0 || n % 2 == 0) {
            return null;
        } else {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < n; i++) {
                int spaces = n / 2 - i > 0 ? n / 2 - i : i - n / 2;
                int diamonds = i <= n / 2 ? 1 + i * 2 : -1 + (Math.abs(i - n) << 1);

                if (spaces != 0) {
                    result.append(String.format(String.format("%%%ds", spaces), " ").replace(" ", spaceSymbol));
                }

                result.append(String.format(String.format("%%%ds", diamonds), " ").replace(" ", diamondSymbol));
                result.append("\n");
            }
            return new String(result);
        }
    }
}
