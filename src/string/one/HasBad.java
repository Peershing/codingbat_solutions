package string.one;

/*
    Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or
    "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
*/

public class HasBad {

    public boolean hasBad(String str) {
        String word = "bad";
        if (str.length() < 3) {
            return false;
        }
        if (str.length() == 3 && str.substring(0, 3).equals(word)) {
            return true;
        }
        if (str.length() > 3 && (str.substring(0, 3).equals(word) || str.substring(1, 4).equals(word))) {
            return true;
        }

        return false;
    }
}