import java.util.Scanner;

public class Circus{
    public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   System.out.println("Congratulations! You have survived the Vampire room. You now have 100 points.");
   System.out.println("You breath a sigh of relief... you are safe for now");
   System.out.println("You take a look around the new room. In the left hand corner there is" +
   " a large group of clowns do circus tricks in the corner. In the middle acrobats wearing all \ndifferent colors doing their sky" +
   "high tricks. In the lower right hand corner a large cage stands empty with \nstraw on the floor..."+
   " there is only one door on the other side of the room.");
   System.out.println("\n What will you do next?");
   System.out.println("\n1) Go to the group of clowns" +
   "\n2) Go watch the acrobats" + "\n3) Go to the door" + "\n4) Go to the cage");

   int choice = scan.nextInt();
   String choiceString = "";

   switch(choice){
    case 1: choiceString = "You walk over to the group of clowns. They just seem to be doing party tricks.";
    break;
    case 2: choiceString = "You watch the acrobats and notice they are wearing different colors, blue, red, and green";
    break;
    case 3: choiceString = "You go to the door on the other side of the room. It seems to require a large golden key and three words to be put in";
    break;
    case 4: choiceString = "You walk over to the cage. There are large scratch marks on the floor and you notice a key covered by hay.";
    break;
   }
   System.out.println(choiceString);
   if(choice == 1){
   System.out.println("What will you do now?");
   System.out.println("1) investigate the clowns" + "\n2) exit ");

   int choice1 = scan.nextInt();
   String choice1String = "";

   switch(choice1){
    case 1: choice1String = "You notice the clowns are doing three different party tricks including juggling, throwing knives, and playing \non a unicycle";
    break;
    case 2: choice1String = "You back away from the clowns...";
    break;
   }
   System.out.println(choice1String);
   }
   
    }
}
