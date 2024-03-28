public class EscapeRoom {
  public static void main(String[] args) {
    Player player = new Player();
    System.out.println("Welcome to the Escape Room game!");
    System.out.println("Instructions:\n1. Explore different rooms using commands like 'Go to', 'Investigate', 'Open', 'Pick up', and 'Exit'.");
    System.out.println("2. Earn points by achieving goals in each room.");
    System.out.println("3. Try to escape the mansion by reaching the final room.");

    // Instantiate rooms
    Room vampireRoom = new Vampire();
    Room circusRoom = new Circus();
    Room zombiesRoom = new Zombies();

    //Player explores rooms
    System.out.println("\nYou find yourself in a haunted mansion...");
    //Implement logic for player to explore rooms
    //Guide the player through rooms based on their choices
  }
}
