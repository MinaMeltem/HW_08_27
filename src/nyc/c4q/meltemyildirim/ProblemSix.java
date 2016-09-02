package nyc.c4q.meltemyildirim;

import java.util.Scanner;

/**
 Hippos only like to eat foods that begin with the letter 'h'. In an effort to reduce food waste,
 the local zoo has hired you to write a Java program that can predict whether or not the hippos will eat a given food.
 While running, your program should prompt the user to enter a food. If the food is one that hippos like to eat,
 the program should print "Yum!" -- otherwise, it should print "Yuck!".
 */
public class ProblemSix {

  public static void main (String[] args) {
    hunngryHippo();
  }
  public static void hunngryHippo(){
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter a food: ");
    String foodName = userInput.next();

    if(foodName.charAt(0) == 'h'){
      System.out.println(" Yum! ");
    }else {
      System.out.println(" Yuck! ");
    }
  }
}
