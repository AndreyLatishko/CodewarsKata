package sixkata;
public class TenMinWalk {
    private  static int x = 0;
    private  static int y = 0;
    public static boolean isValid(char[] walk) {
        for(char result: walk){
            if(result == 'n') x++;
            if(result == 's') x--;
            if(result == 'e') y++;
            if(result == 'w') y--;
        }
        return x == 0 && y == 0 && walk.length == 10;
    }
}
