package sixkata;

public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
      String result ="";
        for (int number : numbers) {
            result += number;
        }
        return "(" + result.substring(0,3) + ") "
                + result.substring(3,6) + "-" + result.substring(6,10);
    }
}
