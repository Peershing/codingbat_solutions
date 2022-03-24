package string.one;

/*
    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and
    "java" yields "ya". If either string is length 0, use '@' for its missing char.
*/

public class LastChars {

    public String lastChars(String a, String b) {
        String result = "";
        if (a.isEmpty() && b.isEmpty()) {
            return "@@";
        }
        if (a.isEmpty()) {
            return "@" + b.substring(b.length()-1, b.length());
        }
        if (b.isEmpty()) {
            return a.substring(0, 1) + "@";
        }

        return a.substring(0, 1) + b.substring(b.length()-1, b.length());
    }
}