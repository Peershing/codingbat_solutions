package string.one;

/*
    Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length
    will be at least 2.
*/

public class WithoutEnd {

    public String withoutEnd(String str) {
        StringBuilder result = new StringBuilder(str);
        return result.delete(0, 1).delete(result.length()-1, result.length()).toString();
    }
}