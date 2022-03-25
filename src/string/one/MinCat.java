package string.one;

/*
    Given two strings, append them together (known as "concatenation") and return the result. However, if the strings
    are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello"
    and "Hi" yield "loHi". The strings may be any length.
*/

public class MinCat {

    public String minCat(String a, String b) {
        if (a.length() > b.length()) {
            a = a.substring(a.length()-b.length(), a.length());
        }
        if (a.length() < b.length()) {
            b = b.substring(b.length()-a.length(), b.length());
        }

        return a.concat(b);
    }
}