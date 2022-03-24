package recursion.one;

/*
    Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have
    been changed to 'y' chars.
*/

public class ChangeXY {
    public String changeXY(String str) {
        return str.replace('x', 'y');
    }
}
