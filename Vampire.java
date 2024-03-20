import java.util.Scanner;

public class Vampire {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("As you walk into the mansion, a chill runs down your back...");
    System.out.println("The door slams shut behind you!");
    System.out.println("A closed casket is on your left, in the corner. " +
    "A large bookshelf, covering the wall to your right from floor to ceiling. " +
    "A wardrobe stands tall in the back right corner, closed shut. " +
    "A massive stone fireplace envelopes the wall in front of you. " +
    "No other doors seem to be present in the room.");
    System.out.println("What will you do now?");
    System.out.println("1) Attempt to open the front door \n" +
    "2) Go to the Casket \n" +
    "3) Go to the Bookshelf \n" +
    "4) Go to the Wardrobe \n" +
    "5) Go to the Fireplace \n");
    int choice1 = scan.nextInt();
    String choice1String = "";
    switch (choice1) {
      case 1: choice1String = "You pull on the door handle, but it doesn't budge. You are trapped in here.";
      break;
      case 2: choice1String = "You walk over to the casket. Its hard wood top seems to be slightly ajar.";
      break;
      case 3: choice1String = "You walk over to the bookshelf. It is filled with row after row of books, ranging from thin, childrens books to thick, old books.";
      break;
      case 4: choice1String = "You walk over to the wardrobe. Its meticulously decorated doors are closed shut.";
      break;
      case 5: choice1String = "You walk over to the fireplace. Charcoal fills it's pit, and bunch of wood is stacked next to it.";
      break;
    }
    System.out.println(choice1String);

    if (choice1 == 1) {
      System.out.println("What will you do now?");
      System.out.println("1) Go to the Casket \n" +
      "2) Go to the Bookshelf \n" +
      "3) Go to the Wardrobe \n" +
      "4) Go to the Fireplace \n");
      int choice11 = scan.nextInt();
      String choice11String = "";
      switch (choice1) {
        case 1: choice11String = "You walk over to the casket. Its hard wood top seems to be slightly ajar.";
        break;
        case 2: choice11String = "You walk over to the bookshelf. It is filled with row after row of books, ranging from thin, childrens books to thick, old books.";
        break;
        case 3: choice11String = "You walk over to the wardrobe. Its meticulously decorated doors are closed shut.";
        break;
        case 4: choice11String = "You walk over to the fireplace. Charcoal fills it's pit, and bunch of wood is stacked next to it.";
        break;
      }
      System.out.println(choice11String);
    } else {
      if(choice1 == 2) {
        System.out.println("What will you do now?");
        System.out.println("1) Open the Casket \n" +
        "2) Exit");
        int choice2 = scan.nextInt();
        String choice2String = "";
        switch (choice2) {
          case 1: choice2String = "You push the top off of the casket. it falls to the floor with a loud thud.";
          break;
          case 2: choice2String = "You walk away from the casket.";
          break;
        }
        System.out.println(choice2String);

        if (choice2 == 1) {
          System.out.println("What will you do now?");
          System.out.println("1) Investigate the inside \n" +
          "2) Exit");
          int choice21 = scan.nextInt();
          String choice21String = "";
          switch (choice21) {
            case 1: choice21String = "You search the inside of the casket. etched into the wood is a phrase. \"The Lion, the Witch, and the Wardrobe\". \n" +
            "you turn away from the casket.";
            break;
            case 2: choice21String = "You walk away from the open casket.";
            break;
          }
          System.out.println(choice21String);


        }
      }
    }
  }
}
