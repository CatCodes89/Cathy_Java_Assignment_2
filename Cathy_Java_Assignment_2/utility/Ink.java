package utility;

import java.util.Scanner;

import armour.Armour;
import warrior.Warrior;
import weapon.Weapon;

public class Ink {
    private static final Scanner scanner = new Scanner(System.in);

    public Ink() {
        // do nothing
    } // constructor

    // Welcome Message
    public void welcomeMessage() {
        System.out.println("""

        __        __             _             ____   ___ ____  _  _   
        \\ \\      / /_ _ _ __ ___(_)_ __ ___   |___ \\ / _ \\___ \\| || |  
         \\ \\ /\\ / / _` | '__/ __| | '_ ` _ \\    __) | | | |__) | || |_ 
          \\ V  V / (_| | |  \\__ \\ | | | | | |  / __/| |_| / __/|__   _|
           \\_/\\_/ \\__,_|_|  |___/_|_| |_| |_| |_____|\\___/_____|  |_|  
        
        
                
      """);
    }

    // Intro
    public String getPlayerName() {
        System.out.println("Welcome traveller to Warsim... Please enter thy name:");
        String playerName = scanner.nextLine(); 
        return playerName; 
    }

    // Warrior Menu
    public void printWarriorMenu() {
        System.out.println("=== Warrior Selection Menu ===");
        System.out.println("Select a Warrior Type:");
        System.out.println("1) Human\n2) Elf\n3) Orc");
        System.out.println("==============================");
    }

    // Weapon Menu  
    public void printWeaponMenu() {
        System.out.println("=== Weapon Selection Menu ===");
        System.out.println("Select a Weapon Type:");
        System.out.println("1) Dagger\n2) Sword\n3) Axe");
        System.out.println("==============================");
    }

    // Armour Menu
    public void printArmourMenu() {
        System.out.println("=== Armour Selection Menu ===");
        System.out.println("Choose Armour Type:");
        System.out.println("1) Leather\n2) Chainmail\n3) Platemail");
        System.out.println("==============================");
    }

    // Attack Menu
    public void printAttackMenu() {
        System.out.println("=== Attack Selection Menu ===");
        System.out.println("Select Attack Type:");
        System.out.println("1) Normal\n2) Heavy");
        System.out.println("==============================");
    }

    // Turn Results

    // Print Stats  
    public void printStats(String playerName, Warrior player, Warrior enemy, 
    Armour pArmour, Armour eArmour, Weapon pWeapon, Weapon eWeapon) {

    System.out.println("=== " + playerName + "'s Stats ===");
    System.out.println("Health: " + player.getHealth());
    System.out.println("Strength: " + player.getStrength());
    System.out.println("Dexterity: " + player.getDexterity());
    System.out.println("Evasion: " + pArmour.getEvasion());
    System.out.println("Critical Chance: " + pWeapon.getCriticalChance());
    System.out.println("==============================");
    
    System.out.println("=== " + enemy.getWarriorType() + "'s Stats ===");
    System.out.println("Health: " + enemy.getHealth());
    System.out.println("Strength: " + enemy.getStrength());
    System.out.println("Dexterity: " + enemy.getDexterity());
    System.out.println("Evasion: " + eArmour.getEvasion());
    System.out.println("Critical Chance: " + eWeapon.getCriticalChance());
    System.out.println("==============================");
} // printStats()

    // GameOver Message
    public void printGameOver(String winner) {
        System.out.printf("""
               __ __
            .-',,^,,'.
           / \\(0)(0)/ \\
           )/( ,_"_,)\\(
           `  >-`~(   ' 
         _N\\ |(`\\ |___
         \\' |/ \\ \\/_-,)
          '.(  \\`\\_<
             \\ _\\|
              | |_\\_
              \\_,_>-'  
        winner: %s               
                """, winner);
    } // printGameOver()
} // class
