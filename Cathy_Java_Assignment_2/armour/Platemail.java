package armour;

public class Platemail extends Armour {
    private int armourAmount = 250;
    private int dexterityCost = 200;
    private int evasion = 10; // new property

    public Platemail() {
        super();
        super.setArmourAmount(armourAmount);
        super.setDexterityCost(dexterityCost);
        super.setEvasion(evasion);
    } // constructor


    public int reduceDamage(int damageAmount) {
        return damageAmount - this.armourAmount / 2;
    }

    public String getType() {
        return "Platemail";
    }

} // class