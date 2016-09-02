package nyc.c4q.meltemyildirim;

/**
 * Write a Java method that takes a string parameter and returns the number of times that the string "code"
 * appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
 *
 For example:
 countCode("aaacodebbb") → 1
 countCode("codexxcode") → 2
 countCode("cozexxcope") → 2
 */
public class ProblemNine {

  public static void main (String[] args) {
    System.out.println(countCode("cozexxcope"));
  }

  public static int countCode(String inputStr) {
    String co= "co" ;
    int coIndex;
    int wordCounter = 0;

    for (int beginIndex = 0; beginIndex< inputStr.length(); beginIndex++){
      coIndex = inputStr.indexOf(co,beginIndex);

      if(coIndex <= inputStr.length()-2 && inputStr.charAt(coIndex+3 )=='e'){
        wordCounter +=1;
        beginIndex = coIndex+4; //skips 4 letter
      }
    }
    return wordCounter;
  }

}
