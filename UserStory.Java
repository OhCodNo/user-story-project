// UserStory class stores weapon data and provides methods to analyze it
public class UserStory {

    // Arrays to hold weapon information
    private String[] weaponNames;    // Array of weapon names
    private String[] damageStrings;  // Array of weapon damage values as strings
    private String[] damageTypes;    // Array of weapon damage types (Melee, Ranged, etc.)
    private String[] useTimeStrings; // Array of use times as strings

    // Constructor: loads data from text files into arrays using a FileReader helper class
    public UserStory(String namesFile, String damageFile, String typeFile, String useTimeFile) {
        this.weaponNames = FileReader.toStringArray(namesFile);   // Load weapon names
        this.damageStrings = FileReader.toStringArray(damageFile); // Load damage values
        this.damageTypes = FileReader.toStringArray(typeFile);    // Load damage types
        this.useTimeStrings = FileReader.toStringArray(useTimeFile); // Load use times
    }

    // Finds the index of the weapon with the highest damage for a given damage type
    public int bestWeaponIndex(String type) {
        int bestIndex = -1;  // Initialize with -1 to indicate no weapon found yet
        int maxDamage = -1;  // Keep track of the highest damage found

        // Loop through all weapons
        for (int i = 0; i < weaponNames.length; i++) {
            // Check if the weapon matches the requested type (case-insensitive)
            if (damageTypes[i].equalsIgnoreCase(type)) {
                // Convert damage from String to integer without using Integer.parseInt
                int dmg = 0;
                for (int j = 0; j < damageStrings[i].length(); j++) {
                    dmg = dmg * 10 + (damageStrings[i].charAt(j) - '0'); // Build integer digit by digit
                }

                // Update best weapon if this one has higher damage
                if (dmg > maxDamage) {
                    maxDamage = dmg;
                    bestIndex = i;
                }
            }
        }
        // Return the index of the best weapon, or -1 if none match
        return bestIndex;
    }

    // Getters to access individual weapon data by index
    public String getWeaponName(int index) { return weaponNames[index]; }
    public String getDamage(int index) { return damageStrings[index]; }
    public String getUseTime(int index) { return useTimeStrings[index]; }

    // toString method provides a summary of the dataset
    public String toString() {
        return "Weapon dataset contains " + weaponNames.length + " weapons across " +
               "damage types: Melee, Ranged, Magic, Summon.";
    }
}