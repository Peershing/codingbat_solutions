package string.one;

/*
    Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length
    will be at least 2.
*/

public class ExtraEnd {

    public String extraEnd(String str) {
        String lastTwo = str.substring(str.length()-2, str.length());
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < 3; i++) {
            result.append(lastTwo);
        }
        return result.toString();
    }
}