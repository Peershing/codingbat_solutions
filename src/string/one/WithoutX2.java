package string.one;

/*
    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
    and otherwise return the string unchanged. This is a little harder than it looks.
*/

public class WithoutX2 {

    public String withoutX2(String str) {
        if (str.length() > 1) {
            if (str.startsWith("xx")) {
                return str.substring(2, str.length());
            }
            else if (str.startsWith("x")) {
                return str.substring(1, str.length());
            }
            else if (str.charAt(1) == 'x') {
                return String.valueOf(str.charAt(0)) + str.substring(2, str.length());
            }
            return str;
        }

        else if (str.length() == 1) {
            if (str.charAt(0) == 'x') {
                return "";
            }
            return str;
        }
        return str;
    }
}