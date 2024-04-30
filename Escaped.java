public class Escaped {
  public void escape() {
      Room vampireRoom = new Vampire();
      Room circusRoom = new Circus();
      Room zombiesRoom = new Zombies();



      int totalScore = vampireRoom.getVampPoints() + circusRoom.getCircPoints() + zombiesRoom.getZombPoints() + 300;
      int totalLives = 3;


      System.out.println("You have survived the wrath of the white witch and you breathe in a gulp of fresh air");
      System.out.println("Congratulations! You successfully escaped the haunted mansion...");


      System.out.println("Points Earned in Vampire Room: " + (vampireRoom.getVampPoints() + 100) +
      "\nPoints Earned in Circus Room: " + (circusRoom.getCircPoints() + 100) +
      "\nPoints Earned in Zombies Room: " + (zombiesRoom.getZombPoints() + 100));
      System.out.println("You have ended with " + totalScore + " points");
      System.out.println("You have " + totalLives + " lives left");
  }
}
