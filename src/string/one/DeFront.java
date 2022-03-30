package string.one;

/*
    Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and
    keep the second char if it is 'b'. The string may be any length. Harder than it looks.
*/

public class DeFront {

    public String deFront(String str) {
        StringBuilder result = new StringBuilder(str);

        if (str.length() >= 2) {
            if (result.charAt(0) != 'a' && result.charAt(1) != 'b') {
                result = result.delete(0, 2);
            }
            else if (result.charAt(0) != 'a') {
                result = result.delete(0, 1);
            }
            else if (result.charAt(1) != 'b') {
                result = result.delete(1, 2);
            }

            return result.toString();
        }

        if (str.length() == 1) {
            if (result.charAt(0) != 'a') {
                result = result.delete(0, 1);
            }

            return result.toString();
        }

        return result.toString();
    }
}