package string.one;

/*
    Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length
    will be at least 2.
*/

public class Left2 {

    public String left2(String str) {
        String firstTwo = str.substring(0, 2);
        StringBuilder result = new StringBuilder(str.substring(2, str.length()));
        result = result.insert(result.length(), firstTwo);

        return result.toString();
    }
}