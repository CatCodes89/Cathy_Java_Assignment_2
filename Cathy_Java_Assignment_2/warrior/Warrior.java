package warrior;

import java.util.Random;

// abstract means it CANNOT be directly instantiated!
public abstract class Warrior {
    // public(open to all), private (internal to class), 
    // protected(combination: closed outside, open on the inside)
    protected Random randNum = new Random(); // family secret!
    private int health; 
    private int strength;
    private int dexterity; // private = class only
    private int evasion; // new property
    private String warriorType;

    public Warrior() { // public = available everywhere
        // do nothing
    } // constructor

    //===============>>
    // GETTERS
    public int getHealth() {
        return this.health; 
    }
    public int getStrength() {
        return this.strength; 
    }
    public int getDexterity() {
        return this.dexterity; 
    }
    public int getEvasion() { // Getter for new property
        return this.evasion;
    }
    public String getWarriorType() {
        return this.warriorType; 
    }
    public boolean isAlive() {
        if(this.health > 0)
          return true;
        else
          return false;
    }

    //===============>>
    // SETTERS
    public void setHealth(int health) {
        this.health = health;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    public void setEvasion(int evasion) { // Setter for new property
        this.evasion = evasion;
    }
    public void setWarriorType(String warriorType) {
        this.warriorType = warriorType;
    }
    public void takeDamage(int damageAmount) {
        if(damageAmount > 0) 
          this.health -= damageAmount;
    }
} // class