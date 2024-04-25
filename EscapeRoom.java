import java.util.ArrayList;

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


abstract class Room{
  protected String description;
  protected int points;

  public Room(String description, int points){
      this.description = description;
      this.points = points;
  }

  public abstract void interact(Player player);
}

// Player class to keep track of player's progress
class Player{
  private int level;
  private int score;
  private int lives;

  public Player(){
      this.level = 0;
      this.score = 0;
      this.lives = 3;
  }

  public int getLevel(){
      return this.level;
  }

  public int getScore(){
      return this.score;
  }

  public int getLives() {
    return this.lives;
  }

  public int setLives() {
    this.lives = lives;
    return this.lives;
  }

  public void increaseScore(int points){
      this.score += points;
  }

  public void levelUp(){
      this.level++;
  }
}


class Inventory {
    private static ArrayList<String> items = new ArrayList<>();

    // Method to add an item to the inventory
    public static void addItem(String item) {
        items.add(item);
    }

    // Method to get the current inventory
    public static ArrayList<String> getInventory() {
        return items;
    }
}
