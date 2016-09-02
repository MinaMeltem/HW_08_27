package nyc.c4q.meltemyildirim;

/**
 Print "The Twelve Days of Christmas", an English carol with a lot of repetition!
 You can find the structure of the lyrics here:
 (The Twelve Days of Christmas Lyrics)[http://en.wikipedia.org/wiki/The_Twelve_Days_of_Christmas_%28song%29#Lyrics].
 Use variables to store bits of repeated data and print the full lyrics.
 */
public class ProblemTwelve {

  public static void main(String[] args) {
    twelveDays(4);  }

  public static void twelveDays(int month) {
    String day = "";
    if(month<=12){
      for (int i = 1; i <= month; i++) {
        switch (i) {
          case 12:
            day = "twelfth";
            break;
          case 11:
            day = "eleventh";
            break;
          case 10:
            day = "tenth";
            break;
          case 9:
            day = "Ninth";
            break;
          case 8:
            day = "Eighth";
            break;
          case 7:
            day = "seventh";
            break;
          case 6:
            day = "sixth";
            break;
          case 5:
            day = "fifth";
            break;
          case 4:
            day = "forth";
            break;
          case 3:
            day = "third";
            break;
          case 2:
            day = "second";
            break;
          case 1:
            day = "first";
            break;

        }
        System.out.println("\nOn the " + day + " day of Christmas\nMy true love sent to me :");

        switch (i) {
          case 12:
            System.out.println("12 Drummers Drumming");
          case 11:
            System.out.println("Eleven Pipers Piping");
          case 10:
            System.out.println("Ten Lords a Leaping");
          case 9:
            System.out.println("Nine Ladies Dancing");
          case 8:
            System.out.println("Eight Maids a Milking");
          case 7:
            System.out.println("Seven Swans a Swimming");
          case 6:
            System.out.println("Six Geese a Laying");
          case 5:
            System.out.println("Five Golden Rings");
          case 4:
            System.out.println("Four Calling Birds");
          case 3:
            System.out.println("Three French Hens");
          case 2:
            System.out.println("Two Turtle Doves");
          case 1:
            System.out.println("And a Partridge in a Pear Tree");
        }
      }
    }else{
      System.out.println("Invalid Input!There are only 12 month in a year!");
    }
  }
}