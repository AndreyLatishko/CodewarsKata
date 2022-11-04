package sixkata;

public class BackspacesInString {
    public String cleanString(String s) {
        StringBuilder b = new StringBuilder();
        for(int i=0; i<s.length(); ++i) {
            char c = s.charAt(i);
            if(c=='#') b.setLength(Math.max(b.length()-1,0));
            //Метод setLength(int newLength) StringBuilder используется для установки длины последовательности символов равной newLength.
                // Для каждого индекса k больше 0 и меньше newLength.
                // Если длина newLength, переданная в качестве аргумента, меньше старой длины, старая длина изменяется на newLength.
                // Если длина newLength, переданная в качестве аргумента, больше или равна старой длине,
                // в конец старой последовательности добавляются нулевые символы ('\u0000'), так что длина становится аргументом newLength.
                //
            else b.append(c);
        }
        return b.toString();
    }
}
