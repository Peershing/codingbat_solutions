package recursion.one;

/*
    Given a string, compute recursively a new string where all the 'x' chars have been removed.
*/

public class NoX {
    public String noX(String str) {
        if (str.isEmpty()) return "";
        else if (str.contains("x")) return noX(str.replaceFirst("x", ""));
        return str;
    }
}
