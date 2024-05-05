package armour;

public class Leather extends Armour {
    private int armourAmount = 50;
    private int dexterityCost = 50;
    private int evasion = 50; // new property

    public Leather() {
        super();
        super.setArmourAmount(armourAmount);
        super.setDexterityCost(dexterityCost);
        super.setEvasion(evasion);
    } // constructor

    public int reduceDamage(int damageAmount) {
        return damageAmount - this.armourAmount / 10;
    }

    public String getType() {
        return "Leather";
    }

} // class