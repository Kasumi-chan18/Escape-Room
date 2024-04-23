import java.util.Scanner;

// Abstract class for rooms
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

    public Player(){
        this.level = 0;
        this.score = 0;
    }

    public int getLevel(){
        return level;
    }

    public int getScore(){
        return score;
    }

    public void increaseScore(int points){
        this.score += points;
    }

    public void levelUp(){
        this.level++;
    }
}

// Zombies room
class Zombies extends Room{
    private boolean hasEscaped;
    private boolean isChased;

    public Zombies(){
        super("You've entered the Zombies room. You must be stealthy to avoid alerting the zombies.", 100);
        this.hasEscaped = false;
        this.isChased = false;
    }

    @Override
    public void interact(Player player){
        Scanner scanner = new Scanner(System.in);
        System.out.println(description);
        while(!hasEscaped && !isChased){
            System.out.println("What will you do?");
            String action = scanner.nextLine().toLowerCase();
            switch(action){
                case "investigate":
                    System.out.println("You walk around the room and see graves and tombstones with names on them," + "the names are Peter, Edmund, Lucy, and Susan.");
                    System.out.println("You then noticed a ghastly-looking white witch standing behind two switches.");
                    break;
                case "open":
                    System.out.println("You can't open anything here.");
                    break;
                case "exit":
                    System.out.println("You can't exit without pulling a switch here.");
                    break;
                case "pick up":
                    System.out.println("You can't pick up anything here.");
                    break;
                case "pull switch":
                    System.out.println("You cautiously pull one of the switches...");
                    // Logic to determine if a player pulled the correct switch
                    boolean correctSwitch = pullSwitch();
                    if(correctSwitch){
                        System.out.println("You hear a distant click." + "A door appears in the room and opens up..." + "You walk through the door carefully..." + "You have escaped the Zombies room!");
                        hasEscaped = true;
                        player.increaseScore(points);
                    }else{
                        System.out.println("Uh-oh..." "You have pulled the wrong switch.");
                        // Logic to handle player being chased
                        isChased = true;
                    }
                    break;
                default:
                    System.out.println("Invalid command. Try again.");
            }
        }
        if (isChased) {
            // Implement logic for player to evade or handle being chased
            System.out.println("The white witch is chasing you ruthlessly, Run!");
            
            // For simplicity, let's assume the player's only option is to exit the game
            System.out.println("The white witch has caught you." + "You have died.");
            System.exit(0);
        }
    }

    private boolean pullSwitch(){
        // Return true if correct, false otherwise
        return false;
    }
}