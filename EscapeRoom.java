public class EscapeRoom {
  public static void main(String[] args) {
    Player player = new Player();
    System.out.println("Welcome to the Escape Room game!");
    System.out.println("Instructions:\n1. Explore different rooms using commands like 'Go to', 'Investigate', 'Open', 'Pick up', and 'Exit'.");
    System.out.println("2. Earn points by achieving goals in each room.");
    System.out.println("3. One wrong move and you may just loose a life...");
    System.out.println("4. Try to escape the mansion by reaching the final room.");

    // Instantiate rooms
    Room vampireRoom = new Vampire();
    Room circusRoom = new Circus();
    Room zombiesRoom = new Zombies();

    //Player explores rooms
    System.out.println("\nYou find yourself in a haunted mansion...");
    vampireRoom.interact(player);
    circusRoom.interact(player);
    zombiesRoom.interact(player);


    // if the player has not survived/
    //ran out of lives then they have to start that particular level over once again
  }
}
