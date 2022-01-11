package recursion.one;

/*
    Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
*/

public class CountAbc {
    public int countAbc(String str) {
        if (str.length() < 3) return 0;
        if (str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba"))
            return 1 + countAbc(str.substring(1));
        else
            return countAbc(str.substring(1));
    }
}
