package fivekata;
public class PigLatin {
    public static String pigIt(String str) {
        if(str == null || str.length() == 0){
            return null;
        }
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}
