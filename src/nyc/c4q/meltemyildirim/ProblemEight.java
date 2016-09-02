package nyc.c4q.meltemyildirim;

/**
 * Created by meltemyildirim on 8/29/16.
 * Write a loop that will print the following triangle to the console:
 #
 ##
 ###
 ####
 #####
 ######
 #######
 */
public class ProblemEight {
  public static void main (String[] args){
    System.out.println(drawTriangle(4));

  }
  public static String drawTriangle(int heights ) {
    String row = "";
    String triangle = "";
    for (int i = 0; i < heights; i++) {
      row += "#";
      triangle += row + '\n'; // take the  row and put it in triangle as a single string
    }
    return triangle; // "#\n##\n###\n"
  }
}