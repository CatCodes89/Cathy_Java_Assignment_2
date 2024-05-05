package armour;

public abstract class Armour {
    private int armourAmount;
    private int dexterityCost;
    private int evasion; // new property

    public Armour() {
        // do nothing
    }

    //===============>>
    // GETTERS
    public int getArmourAmount() {
        return this.armourAmount;
    }
    public int getDexterityCost() {
        return this.dexterityCost;
    }
    public int getEvasion() { // new property
        return this.evasion;
    }
    public abstract int reduceDamage(int damageAmount);

    //===============>>
    // SETTERS
    public void setArmourAmount(int armourAmount) {
        this.armourAmount = armourAmount;
    }
    public void setDexterityCost(int dexterityCost) {
        this.dexterityCost = dexterityCost;
    }
    public void setEvasion(int evasion) { // new property
        this.evasion = evasion;
    }

    public abstract String getType();

} // class