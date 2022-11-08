package fivekata;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        String result ="";
        for (String s: arr ) {
            result = (result + "," + s)
                    .replace(",EAST,WEST", "")
                    .replace(",WEST,EAST", "")
                    .replace(",SOUTH,NORTH", "")
                    .replace(",NORTH,SOUTH", "");
        }
        return result.isEmpty() ? new String[0] : result.substring(1).split(",");
    }
}
