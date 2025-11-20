import java.util.Scanner; // Import the Scanner class to read input from the user

public class DataRunner {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Create a UserStory object called 'weapons' and load data from four text files:
        // "weaponName.txt" contains the names of weapons
        // "damage.txt" contains the damage values
        // "damageType.txt" contains the type of damage (Melee, Ranged, Magic, etc.)
        // "useTime.txt" contains the time it takes to use the weapon
        UserStory weapons = new UserStory(
            "weaponName.txt",
            "damage.txt",
            "damageType.txt",
            "useTime.txt"
        );

        // Print the general information about all weapons in the dataset
        System.out.println(weapons);

        // Ask the user to enter a damage type they want to filter by
        System.out.println("Select damage type (Melee, Ranged, Magic, Summon):");
        String inputType = sc.nextLine().trim(); // Read the user's input and remove extra spaces

        // Call the 'bestWeaponIndex' method of the UserStory object to find the index of
        // the best weapon that matches the given damage type
        int bestWeapon = weapons.bestWeaponIndex(inputType);

        // If a valid weapon index is found (not -1), display its details
        if (bestWeapon != -1) {
            System.out.println("\nBest weapon for " + inputType + ":");
            System.out.println("Name: " + weapons.getWeaponName(bestWeapon)); // Print the weapon's name
            System.out.println("Damage: " + weapons.getDamage(bestWeapon));   // Print the weapon's damage
            System.out.println("Use time: " + weapons.getUseTime(bestWeapon)); // Print the weapon's use time
        } else {
            // If no weapon matches the requested type, inform the user
            System.out.println("No weapons found for that type.");
        }

        // Close the Scanner object to free resources
        sc.close();
    }
}