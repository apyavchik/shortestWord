public class ShortestWord {
    public static int findShort(String s) {
        String[] arrString = s.split(" ");
        String shortestString = arrString[0];
        for (int i = 0; i < arrString.length; i++) {
            if (arrString[i].length() < shortestString.length()) {
                shortestString = arrString[i];
            }
        }
        return shortestString.length();
    }
}
