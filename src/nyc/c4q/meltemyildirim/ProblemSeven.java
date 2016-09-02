package nyc.c4q.meltemyildirim;

/**
 * Write a method that takes a string parameter. For longer strings, the method returns a new string
 * constructed out of the first three letters of the argument, followed by three periods ("..."),
 * followed by the last letter of the argument. However, if the resulting string is not shorter than the argument,
 * the method should return the argument instead.

 For example,

 elide("Hello!")               // returns "Hello!"
 elide("Hello, world!")        // returns "Hel...!"
 elide("That's not my name.")  // returns "Tha...."
 */
public class ProblemSeven {

  public static void main(String[] args) {
    System.out.println(stringElide("Hello, world!"));
  }

  public static String stringElide(String strGiven) {
    StringBuilder constructedStr = new StringBuilder("mmm...");

    if (constructedStr.length() >= strGiven.length()) {
        return strGiven;
    } else {
        for (int i = 0; i < 3; i++) {
          constructedStr.setCharAt(i, strGiven.charAt(i));
        }
        constructedStr.append(strGiven.substring(strGiven.length() - 1, strGiven.length()));
        return constructedStr.toString();
    }
  }
}