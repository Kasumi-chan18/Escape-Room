import java.util.Scanner;

public class Vampire {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("As you walk into the mansion, a chill runs down your back...");
    System.out.println("The door slams shut behind you!");
    System.out.println("A closed casket is on your left, in the corner. \n" +
    "A large bookshelf, covering the wall to your right from floor to ceiling. \n" +
    "A wardrobe stands tall in the back right corner, closed shut. \n" +
    "A massive stone fireplace envelopes the wall in front of you. \n" +
    "No other doors seem to be present in the room.");
    System.out.println("What will you do now?");
    System.out.println("1) Open the front door \n" +
    "2) Go to the Casket \n" +
    "3) Go to the Bookshelf \n" +
    "4) Go to the Wardrobe \n" +
    "5) Go to the Fireplace \n");
    int choice1 = scan.nextInt();
    String choice1String = "";
    switch (choice1) {
      case 1: choice1String = "You pull on the door handle, but it doesn't budge. You are trapped in here.";
      break;
      case 2: choice1String = "You walk over to the casket. Its hard wood top seems to be slightly ajar. \n";
      break;
      case 3: choice1String = "You walk over to the bookshelf. It is filled with row after row of books, " +
      "ranging from thin, childrens books to thick, old books. \n";
      break;
      case 4: choice1String = "You walk over to the wardrobe. Its meticulously decorated doors are closed shut. \n";
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
      switch (choice11) {
        case 1: choice11String = "You walk over to the casket. Its hard wood top seems to be slightly ajar. \n";
        break;
        case 2: choice11String = "You walk over to the bookshelf. It is filled with row after row of books, " +
        "ranging from thin, childrens books to thick, old books. \n";
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
          case 1: choice2String = "You push the top off of the casket. it falls to the floor with a loud thud. \n";
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
            case 1: choice21String = "You search the inside of the casket. It is void of anything, but when you look closely, " +
            "you find, etched into the wood, is two phrases... \n" +
            "╭━━━━┳╮╱╱╱╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╭╮╭╮╱╱╱╱╱╭╮╭╮╭╮╭╮╱╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╭╮╱╭╮╭╮╱╱╱╱╱╭╮╭╮╭╮╱╱╱╱╱╱╭╮╱╱╱╱╭╮ \n" +
            "┃╭╮╭╮┃┃╱╱╱╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╭╯╰┫┃╱╱╱╱╱┃┃┃┃┃┣╯╰╮╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱┃┃╭╯╰┫┃╱╱╱╱╱┃┃┃┃┃┃╱╱╱╱╱╱┃┃╱╱╱╱┃┃ \n" +
            "╰╯┃┃╰┫╰━┳━━╮┃┃╱╱╭┳━━┳━╮╱╱╰╮╭┫╰━┳━━╮┃┃┃┃┃┣╮╭╋━━┫╰━╮╱╭━━┳━╮╭━╯┃╰╮╭┫╰━┳━━╮┃┃┃┃┃┣━━┳━┳━╯┣━┳━━┫╰━┳━━╮ \n" +
            "╱╱┃┃╱┃╭╮┃┃━┫┃┃╱╭╋┫╭╮┃╭╮╮╱╱┃┃┃╭╮┃┃━┫┃╰╯╰╯┣┫┃┃╭━┫╭╮┃╱┃╭╮┃╭╮┫╭╮┃╱┃┃┃╭╮┃┃━┫┃╰╯╰╯┃╭╮┃╭┫╭╮┃╭┫╭╮┃╭╮┃┃━┫ \n" +
            "╱╱┃┃╱┃┃┃┃┃━┫┃╰━╯┃┃╰╯┃┃┃┣╮╱┃╰┫┃┃┃┃━┫╰╮╭╮╭┫┃╰┫╰━┫┃┃┣╮┃╭╮┃┃┃┃╰╯┃╱┃╰┫┃┃┃┃━┫╰╮╭╮╭┫╭╮┃┃┃╰╯┃┃┃╰╯┃╰╯┃┃━┫ \n" +
            "╱╱╰╯╱╰╯╰┻━━╯╰━━━┻┻━━┻╯╰┻┫╱╰━┻╯╰┻━━╯╱╰╯╰╯╰┻━┻━━┻╯╰┻┫╰╯╰┻╯╰┻━━╯╱╰━┻╯╰┻━━╯╱╰╯╰╯╰╯╰┻╯╰━━┻╯╰━━┻━━┻━━╯ \n" +
            "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╯╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╯ \n" +
            "╭━━━╮╱╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╱╱╱╭╮╭━╮╭╮╭╮╱╱╱╱╱╭╮╱╭╮╭╮╱╱╱╱╱╭━━━╮╱╱╭╮ \n" +
            "┃╭━╮┃╱╱╱╱╱╱╱╱╱╱╱╭╯╰╮╱╱╱╱┃┃┃╭╯┃┃┃┃╱╱╱╱╱┃┃╭╯╰┫┃╱╱╱╱╱┃╭━╮┃╱╭╯╰╮ \n" +
            "┃┃╱╰╋╮╭┳━┳┳━━┳━━╋╮╭╋╮╱╭╮┃╰╯╯╭┫┃┃┃╭━━┳━╯┃╰╮╭┫╰━┳━━╮┃┃╱╰╋━┻╮╭╯ \n" +
            "┃┃╱╭┫┃┃┃╭╋┫╭╮┃━━╋┫┃┃┃╱┃┃┃╭╮┃┣┫┃┃┃┃┃━┫╭╮┃╱┃┃┃╭╮┃┃━┫┃┃╱╭┫╭╮┃┃ \n" +
            "┃╰━╯┃╰╯┃┃┃┃╰╯┣━━┃┃╰┫╰━╯┃┃┃┃╰┫┃╰┫╰┫┃━┫╰╯┃╱┃╰┫┃┃┃┃━┫┃╰━╯┃╭╮┃╰╮ \n" +
            "╰━━━┻━━┻╯╰┻━━┻━━┻┻━┻━╮╭╯╰╯╰━┻┻━┻━┻━━┻━━╯╱╰━┻╯╰┻━━╯╰━━━┻╯╰┻━╯ \n" +
            "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭━╯┃ \n" +
            "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╰━━╯ \n";
            break;
            case 2: choice21String = "You walk away from the open casket.";
            break;
          }
          System.out.println(choice21String);

          if (choice21 == 1) {
            System.out.println("What will you do now?");
            System.out.println("1) Lie inside the casket \n" +
            "2) Exit");
            int choice211 = scan.nextInt();
            String choice211String = "";
            switch (choice211) {
              case 1: choice211String = "You lie down inside of the casket. The bottom sinks down slowly. suddenly, " +
              "the bottom opens out from under you! \n" +
              "You Have Died. \n" +
              "REST IN PIECE \n" +
              "YOU HAVE PERISHED IN THE VAMPIRE ROOM \n";
              break;
              case 2: choice211String = "You get a bad feeling from the casket, and walk away.";
              break;
            }
            System.out.println(choice211String);

            if (choice211 == 2) {
              System.out.println("What will you do now?");
              System.out.println("");
            }
          }
        }
      }
      if(choice1 == 3) {
        System.out.println("What will you do now?");
        System.out.println("1) Open the Wardrobe \n" +
        "2) Exit \n");
        int choice3 = scan.nextInt();
        String choice3String = "";

        switch (choice3) {
          case 1: choice3String = "You open the wardrobe. From left to right, there are 5 clothing items total. A vampire's suit, ";
        }
      }
    }
  }
}
