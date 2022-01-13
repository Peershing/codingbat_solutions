package recursion.one;

/*
    Given a string that contains a single pair of parenthesis, compute recursively a new string made of
    only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
*/

public class ParenBit {
    public String parenBit(String str) {
        if (str.equals("")) return str;
        if (str.charAt(0) == '(') {
            if (str.charAt(str.length()-1) == ')')
                return str;
            else
                return parenBit(str.substring(0, str.length()-1));
        } else
            return parenBit(str.substring(1));
    }
}
