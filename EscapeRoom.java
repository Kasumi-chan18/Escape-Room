public class EscapeRoom {
  public static <Circus> void main(String[] args) {
    Player player = new Player();
    System.out.println("Welcome to the Escape Room game!");
    System.out.println("Instructions:\n1. Explore different rooms using commands like 'Go to', 'Investigate', 'Open', 'Pick up', and 'Exit'.");
    System.out.println("2. Earn points by achieving goals in each room.");
    System.out.println("3. Try to escape the mansion by reaching the final room.");

    // Instantiate rooms
    Vampire vampireRoom = new Vampire();
    Circus circusRoom = new Circus();
    Zombies zombiesRoom = new Zombies();

    //Player explores rooms
    System.out.println("\nYou find yourself in a haunted mansion...");
    vampireRoom.interact(player);
    circusRoom.interact(player);
    zombiesRoom.interact(player);

    // Check if player has reached the end
    if(player.getLevel() == 3){
      System.out.println("Congratulations! You have escaped the mansion!");
      System.out.println("Final Score: " + player.getScore());
    }else{
      System.out.println("Game Over! You didn't escape the mansion." + "The white witch has caught you." + "You have died.");
    }
  }
}
