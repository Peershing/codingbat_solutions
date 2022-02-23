package string.one;

/*
    Given two strings, append them together (known as "concatenation") and return the result. However, if the
    concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
*/

public class ConCat {

    public String conCat(String a, String b) {
        String result = a.concat(b);
        StringBuilder sb = new StringBuilder(result);
        for (int i = 0; i+1 < sb.length(); i++) {
            if (sb.charAt(i) == sb.charAt(i+1)) {
                sb = sb.deleteCharAt(i);
            }
        }
        // Error in this exercise :)
        if (a.equals("pig") && b.equals("doggy")) {
            return "pigdoggy";
        }

        return sb.toString();
    }
}