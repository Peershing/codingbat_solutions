package api.one;

/*
    Given an array of scores, return true if there are scores of 100 next to each other in the array.
    The array length will be at least 2.
*/

public class Scores100 {

    public boolean scores100(int[] scores) {
        for (int i = 0; i+2 <= scores.length; i++) {
            if (scores[i] == 100 && scores[i+1] == 100)
                return true;
        }
        return false;
    }
}