package nyc.c4q.meltemyildirim;

/**
 * Write a function that accepts a string as a parameter and counts the number of vowels within the string
 * (vowels include a, e, i, o , u - don't count 'y'). The function should return the number of vowels in the string.

 Example output:
 vowelCount('test string'); // returns 2
 vowelCount('longer string with more vowels'); // returns 8
 */
public class ProblemTen {
  public static void main (String[] args){
    System.out.println(countVowels("longer string with more vowels"));
  }
  public static int countVowels(String inputStr){
    int counter = 0;

    for(int i = 0; i<inputStr.length(); i++){
      switch(inputStr.charAt(i)){
        case 'a':
          counter+=1;
          break;
        case 'e':
          counter+=1;
          break;
        case 'i':
          counter+=1;
          break;
        case 'o':
          counter+=1;
          break;
        case 'u':
          counter+=1;
          break;
        default:
          counter=counter;
      }
    }
    return counter;
  }

}
