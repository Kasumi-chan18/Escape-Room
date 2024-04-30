import java.util.Scanner;

// Zombies room
class Zombies extends Room{
    private boolean hasEscaped;
    private boolean isChased;

    public Zombies(){
        super("The door opens from the Circus room, you walk into the next room carefully...", 100);
        this.hasEscaped = false;
        this.isChased = false;
    }

    @Override
    public void interact(Player player){
        Scanner scanner = new Scanner(System.in);
        System.out.println(description);
        int points = 100;
        int lives = player.getLives();
        System.out.println("You've entered the Zombies room! You have " + points + "points and " + lives + " lives left. \n" + "You must be stealthy to avoid alerting the wandering zombies.");
        while(!hasEscaped && !isChased){
            System.out.println("What will you do?");
            String action = scanner.nextLine().toLowerCase();
            switch(action){
                case "investigate":
                    System.out.println("You walk around the room and see graves and tombstones with names on them. \n" + "The names read: \n" + "Peter \n" + "Edmund \n" + "Lucy \n" + "Susan");
                    System.out.println("You look to your left and notice a ghastly, scary-looking white witch standing behind two giant switches, staring wickedly at you.");
                    System.out.println("You feel another chill run down your spine, so you cower in fear and tread carefully.");
                    break;
                case "open":
                    System.out.println("You can't open anything in this room.");
                    break;
                case "exit":
                    System.out.println("You can't exit without pulling a switch in this room.");
                    break;
                case "pick up":
                    System.out.println("You can't pick up anything in this room.");
                    break;
                case "pull switch":
                    System.out.println("You cautiously pull one of the switches...");
                    // Logic to determine if a player pulled the correct switch
                    boolean correctSwitch = pullSwitch();
                    if(correctSwitch){
                        System.out.println("You hear a distant click." + "A door appears in the room and opens up... \n" + "You walk through the door carefully...\n" + "You have escaped the Zombies room!");
                        hasEscaped = true;
                        player.increaseScore(points);
                    }else{
                        System.out.println("Uh-oh..." + "You have pulled the wrong switch.");
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
            System.out.println("The white witch is chasing you! Run!");
            
            // For simplicity, let's assume the player's only option is to exit the game
            System.out.println("The white witch has caught you." + "You have died." + "Restart the game to escape the haunted mansion...");
            System.exit(0);
        }
    }

    private boolean pullSwitch(){
        // Return true if correct, false otherwise
        if(correctSwitch){
            return true;
        }else{
            return false;
        }
    }
}
