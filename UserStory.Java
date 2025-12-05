public class UserStory {
  // Instance variables for our weapon.
    private String[] weaponNames;
    private int[] damage;
    private String[] damageTypes;
    private int[] useTime;
  //Reads through our txt files.
    public UserStory(String namesFile, String damageFile, String typeFile, String useTimeFile) {
        weaponNames = FileReader.toStringArray(namesFile);
        damageTypes = FileReader.toStringArray(typeFile);
        damage = FileReader.toIntArray(damageFile);
     useTime = FileReader.toIntArray(useTimeFile);

    }
  //Finds the best weapon when we mention a category.
 public int findBestWeapon(String type) {
   //These are our defaults, so if it fails to recognize any category and can't update, it will display the else in the DataRunner.
        int bestIndex = -1;
     int highestDamage = -1;
   //Checks the index of damageTypes, if it equals the type the user asked for, it continues.
   //After this, it checks the index/number of those types, if it finds one better than the highestDamage, it updates highestDamage.
   //bestIndex takes i's value of the best damage.
   for (int i = 0; i < weaponNames.length; i++) {
            if (damageTypes[i].equals(type)) {  
       if (damage[i] > highestDamage) {
       highestDamage = damage[i];
       bestIndex = i;
         }
       }
      }
    return bestIndex;
    }
  //Getter methods for us to use, there's no getDamageType considering it isn't needed to be returned. I can just code the thing we typed to be that.
    public String getWeaponName(int index) { return weaponNames[index]; }
    public int getDamage(int index) { return damage[index]; }
    public int getUseTime(int index) { return useTime[index]; }
//Pretty much gives us a summary of how many weapons we have in this array, and tells the user that not every weapon is included to make sure the user knows that the data isn't perfectly complete/shortened.
 public String toString() {
   return "Dataset contains " + weaponNames.length + " weapons. NOT ALL ARE INCLUDED";
 }
}
