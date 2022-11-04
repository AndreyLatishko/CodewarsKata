package sixkata;

public class AscendDescend {
    public static String ascendDescendFirst(int length, int minimum, int maximum) {
        StringBuilder stringBuilder = new StringBuilder();
        if (length == 0 || maximum < minimum) return " ";
        while (length != stringBuilder.length()) {
            for (int i = minimum; i < maximum; i++) {
                stringBuilder.append(i);
                if (length == stringBuilder.length()) {
                    return String.valueOf(stringBuilder);
                }
            }
            for (int y = maximum; y > minimum; y--) {
                stringBuilder.append(y);
                if (length == stringBuilder.length()) {
                    return String.valueOf(stringBuilder);
                }
            }
        }

        return String.valueOf(stringBuilder);
    }

    public static String ascendDescend(int length, int minimum, int maximum) {
        String s = "" ;
        for (int i = minimum ; i <=maximum ; i ++) {
            s = s + i;
        }
        for (int i = maximum-1 ; i >minimum ; i--) {
            s = s + i;
        }
            if (s.length() == 0) return s;
            s = s.repeat(length / s.length() + 1);
            return s.substring(0, length);

        }
    }
