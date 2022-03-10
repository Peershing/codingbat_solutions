package string.one;

/*
    Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding"
    yields "codign".
*/

public class LastTwo {

    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }

        StringBuilder result = new StringBuilder(str);
        result.setCharAt(result.length()-2, str.charAt(str.length()-1));
        result.setCharAt(result.length()-1, str.charAt(str.length()-2));
        return result.toString();
    }
}