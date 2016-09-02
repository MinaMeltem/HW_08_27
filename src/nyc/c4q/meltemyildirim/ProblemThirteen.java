package nyc.c4q.meltemyildirim;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
/**
 Your friends just came up with a great new start-up idea: it's like Uber for ice cream!
 They've asked you to write a prototype Java program that will accept ice cream orders for delivery.
 The program should use a Scanner object to read user input and should:

 Greet the user and ask them for a name.
 Ask the user what flavor of ice cream they would like. If you don't have flavor prompt user to choose different flavor.
 Ask the user if he/she wants to add topping.(Y/N) Then ask  for flavor.If input is invalid , prompt user to input valid value.
 Calculate the total price of the order: the base ice cream costs $2.33 and each topping is an additional $0.33 cents.
 Calculate a delivery wait time estimate, which should be a random number of minutes between 1 and 60.
 Print an order confirmation to the console that contains the following details: the user's name, ice cream flavor,
 number of toppings, total price, and delivery wait time.

 */
public class ProblemThirteen {
  public static void main(String[] args){
    iceCream();

  }

  //Whether input flavor is in IceCream menu
  public static boolean isMatch(String[] flavorMenu, String chosenFlavor) {
    for(int i=0; i<flavorMenu.length-1; i++){
      if(chosenFlavor.equalsIgnoreCase(flavorMenu[i])){
        return true;
      }
    }
    return false;
  }


  public static void iceCream() {
    String[] flavorMenu = {"vanilla", "chocolate", "chocolate chip", "cherry", "charamel", "berries", "lemon", "melon", "mint", "banana", "watermelon", "strawberry", "peach"};

    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to our ice cream service! What's your name?");
    String name = scanner.nextLine();
    System.out.println("Okay " + name + " ,which flavor of ice cream would you like?");
    String baseFlavor = scanner.nextLine();


    while (true) {
      if (isMatch(flavorMenu, baseFlavor)) {
        break;
      }
      System.out.println("Sorry ! We don't have that flavor.Try something else !");
      baseFlavor = scanner.nextLine();
    }

    double totalPrice = 2.99;
    int toppingCounter = 0;

    System.out.println("Great!.." + baseFlavor + " ice cream is delicious..\nWould you like to add toppings (Yes/No) ?");
    if (scanner.nextLine().equalsIgnoreCase("yes")) {
      while (true) {
        System.out.println("What kind of topping would you like to add?");
        String topping = scanner.nextLine();
        if(isMatch(flavorMenu, topping)){
          totalPrice = totalPrice + 0.33;
          toppingCounter +=1;
        }
        else{
          System.out.println("Sorry ! We don't have that flavor.Pick something else !");
          continue;
        }

        System.out.println("Another one?(Yes/No)");
        if(!scanner.nextLine().equalsIgnoreCase("yes")) {
          break;
        }
      }
    }
    //total price calculation
    System.out.println();
    Random rand = new Random ();
    int time =rand.nextInt(30-10) +10;
    totalPrice = Math.round(totalPrice * 100);

    System.out.println("Thank you " +name+ "\nYour order is A "+ baseFlavor +" ice cream with "+toppingCounter+ " toppings. " +
        "\nYour total is $" + totalPrice/100 + "\nYour ice cream will arrive in " + time + " minutes.");

  }

}
