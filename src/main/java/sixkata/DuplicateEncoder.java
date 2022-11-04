package sixkata;

import java.util.stream.Collectors;

public class DuplicateEncoder {
    static String encode(String word){
        return word.toLowerCase().chars()
                .mapToObj(i -> word.toLowerCase().indexOf(i) ==  word.toLowerCase().lastIndexOf(i) ? "(" : ")")
                .collect(Collectors.joining());
    }
}
