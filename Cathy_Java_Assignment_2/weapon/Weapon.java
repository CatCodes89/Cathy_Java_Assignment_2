package weapon;

import java.util.Random;

public abstract class Weapon {
    private int damageAmount;
    private int dexterityCost;
    private int criticalChance; // new property
    protected Random randNum = new Random();

    public Weapon() {
        // do nothing
    } // constructor

        //===============>>
    // GETTERS
    public int getDamageAmount() {
        return this.damageAmount; 
    }
    public int getDexterityCost() {
        return this.dexterityCost; 
    }
    public int getCriticalChance() { // getter with new property
        return this.criticalChance; 
    }

    //===============>>
    // SETTERS
    public void setDamageAmount(int damageAmount) {
        this.damageAmount = damageAmount;
    }
    public void setDexterityCost(int dexterityCost) {
        this.dexterityCost = dexterityCost;
    }
    public void setCritcalChance(int criticalChance) { // setter with new property
        this.criticalChance = criticalChance;
    }
    // makes it polymorphic!
    public abstract int strike(int weatherIntensity, int attackType, int Strength, int Dexterity);

    public abstract String getType();
} //  class