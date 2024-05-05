package armour;

public class Chainmail extends Armour {
    private int armourAmount = 150;
    private int dexterityCost = 100;
    private int evasion = 25; // new property

    public Chainmail() {
        super();
        super.setArmourAmount(armourAmount);
        super.setDexterityCost(dexterityCost);
        super.setEvasion(evasion);
    } // constructor

    public int reduceDamage(int damageAmount) {
        return damageAmount - this.armourAmount / 5;
    }

    public String getType() {
        return "Chainmail";
    }

} // class