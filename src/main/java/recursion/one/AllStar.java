package recursion.one;

/*
    Given a string, compute recursively a new string where all the adjacent chars are now separated
    by a "*".
*/

public class AllStar {

    public String allStar(String str) {
        if (str.equals("") || str.length() == 1) return str;
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }
}
