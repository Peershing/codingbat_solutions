package string.one;

/*
    Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty
    string.
*/

public class SeeColor {

    public String seeColor(String str) {
        if (str.startsWith("blue")) {
            return "blue";
        }
        if (str.startsWith("red")) {
            return "red";
        }

        return "";
    }
}