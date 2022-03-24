package recursion.one;

/*
    Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear
    in the string somewhere, possibly with overlapping. N will be non-negative.
*/

public class StrCopies {

    public boolean strCopies(String str, String sub, int n) {
        if (func(str, sub) == n) return true;
        else return false;
    }

    private int func(String str, String sub) {
        int strlen = str.length();
        int sublen = sub.length();
        if (strlen < sublen) return 0;
        if (str.substring(0, sublen).equals(sub))
            return 1 + func(str.substring(1), sub);
        else
            return func(str.substring(1), sub);
    }
}
