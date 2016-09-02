package nyc.c4q.meltemyildirim;

/**
 * Write a function to return a part of string after a specified character.
 * The function should take two arguments, the first being the string, and the second being the character.
 * The function should return only the part of the string that comes AFTER the specified character.
 * In other words, the function should chop the string into two parts and return only the part that
 * comes after the specified character.

 Examples:
 subStrAfterChars('this is a test string', 'a') // returns " test string"
 subStrAfterChars('this is another test', 'o') // returns "ther test"
 */
public class ProblemEleven {
  public static void main (String[] args){
    System.out.println(subStrAfterChars("this is another test", 'o'));
  }

  public static String subStrAfterChars(String strInp, char inpChr) {
    int subStrIndex = 0;
    for (int i = 0; i<strInp.length(); i++){
      if(strInp.charAt(i) == inpChr){
        subStrIndex = i+1;
        break;
      }
      else{
        continue;
      }
    }
    return strInp.substring(subStrIndex);
  }
}
