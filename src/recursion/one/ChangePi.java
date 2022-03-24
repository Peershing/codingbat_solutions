package recursion.one;

/*
    Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced
    by "3.14".
*/

public class ChangePi {

    public String changePi(String str) {
        return str.replaceAll("pi", "3.14");
    }
}
