package string.one;

/*
    Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at
    least length 1.
*/

public class NonStart {

    public String nonStart(String a, String b) {
        return new StringBuilder(a.substring(1, a.length())).append(b.substring(1, b.length())).toString();
    }
}