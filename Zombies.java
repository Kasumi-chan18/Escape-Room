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

    public Zombies(){
        super("You've entered the Zombies room. You must be stealthy to avoid alerting the zombies.", 100);
        this.hasEscaped = false;
    }

    @Override
    public void interact(Player player){
        Scanner scanner = new Scanner(System.in);
        System.out.println(description);
        while(!hasEscaped){
            System.out.println("What will you do?");
            String action = scanner.nextLine().toLowerCase();
            switch(action){
                case "investigate":
                    System.out.println("You see graves with tombstones, and a white with behind two switches.");
                    break;
                case "open":
                    System.out.println("You can't open anything here.");
                    break;
                case "exit":
                    System.out.println("There's nothing to pick up here.");
                    break;
                case "pull switch":
                    System.out.println("You pull a switch...");
                    // Logic to determine if a player pulled the correct switch
                    boolean correctSwitch = pullSwitch();
                    if(correctSwitch){
                        System.out.println("You hear a distant click. You have escaped the Zombies room!");
                        hasEscaped = true;
                        player.increaseScore(points);
                    }else{
                        System.out.println("The white with starts chasing you!");
                        //Logic to handle player being chased

                    }
                    break;
                default:
                    System.out.println("Invalid command. Try again.");
            }
        }
    }

    private boolean pullSwitch(){
        // Implement logic to determine if correct switch is pulled
        //Return true if correct, false otherwise
        return false;
    }
}