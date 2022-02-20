package string.one;

/*
    Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@'
    for the missing chars.
*/

public class AtFirst {

    public String atFirst(String str) {
        StringBuilder result = new StringBuilder("");

        if (str.length() < 2) {
            result = result.append(str);
            while (result.length() < 2) {
                result = result.append("@");
            }

            return result.toString();
        }

        result = result.append(str.substring(0, 2));
        return result.toString();
    }
}