package recursion.one;

/*
    Given a string, compute recursively the number of times lowercase "hi" appears in the string, however
    do not count "hi" that have an 'x' immedately before them.
*/

public class CountHi2 {
    public int countHi2(String str) {
        int len = str.length();
        if (len < 2) return 0;
        if (str.substring(len-2, len).equals("hi")) {
            if ((len > 2 && str.charAt(len-3) != 'x') || len == 2 )
                return 1 + countHi2(str.substring(0, len-1));
        }
        return countHi2(str.substring(0, len-1));
    }
}
