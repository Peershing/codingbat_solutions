package string.one;

/*
    Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye"
    returns "HiByeByeHi".
*/

public class HelloName {

    public String makeAbba(String a, String b) {
        StringBuilder result = new StringBuilder("");
        return result.append(a).append(b).append(b).append(a).toString();
    }
}