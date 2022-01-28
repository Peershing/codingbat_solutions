package string.one;

/*
    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
*/

public class HelloName {

    public String helloName(String name) {
        StringBuilder result = new StringBuilder("Hello ");
        return result.append(name).append("!").toString();
    }
}