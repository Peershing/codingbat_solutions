package recursion.one;

/*
    Given a string and a non-empty substring sub, compute recursively the largest substring which starts
    and ends with sub and return its length.
*/

public class StrDist {

    public int strDist(String str, String sub) {
        return func(str, sub).length();
    }

    private String func(String str, String sub) {
        int strlen = str.length();
        int sublen = sub.length();
        if (str.equals("")) return str;
        if (str.startsWith(sub)) {
            if (str.substring(strlen-sublen, strlen).equals(sub))
                return str;
            else
                return func(str.substring(0, strlen-1), sub);
        }
        else
            return func(str.substring(1), sub);
    }
}
