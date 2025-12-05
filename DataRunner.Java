import java.util.Scanner;

public class DataRunner {
 public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
     UserStory weapons = new UserStory(
            "weaponName.txt",
            "damage.txt",
            "damageType.txt",
            "useTime.txt"
        );
   // prints our weapon choices.
  System.out.println(weapons);
    System.out.println("Please enter the damage type exactly (Melee, Ranged, Magic, Summon):");
   //Searches for the type that the scanner picks up
  String inputType = Scanner.nextLine().trim();
     int bestWeapon = weapons.findBestWeapon(inputType);
   //if found, it'll display this.
     if (bestWeapon != -1) {
      System.out.println("\nThe best weapon for " + inputType + " is:");
       System.out.println("Name: " + weapons.getWeaponName(bestWeapon));
       System.out.println("Damage: " + weapons.getDamage(bestWeapon));
         System.out.println("Use time: " + weapons.getUseTime(bestWeapon));
        } else {
            System.out.println("Sorry, no weapons found for that type."); // Pretty much, if the best index/weapon wasn't updated and is still -1, it displays this.
        }
   //Closes the scanner because everything is done after that. if you need to start again, run the program oncemore.
Scanner.close();
    }
}
