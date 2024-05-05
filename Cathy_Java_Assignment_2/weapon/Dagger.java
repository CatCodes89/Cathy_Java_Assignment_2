package weapon;

public class Dagger extends Weapon {
    private int damageAmount = 50;
    private int dexterityCost = 50;
    private int hitPercentage = 90;
    private int criticalChance = 25; // new property

    public Dagger(int criticalChance) {
        super();
        super.setDamageAmount(damageAmount); 
        super.setDexterityCost(dexterityCost);
        super.setCritcalChance(criticalChance); // new property
    } // constructor

    public int strike(int weatherIntensity, int attackType, int strength, int dexterity) {
        int amount = 0;
        // roll the dice
        int roll = super.randNum.nextInt(100) + 1; // 1 - 100

        // Critical hit chance logic
        boolean isCriticalHit = roll <= criticalChance;

        // increasing hitPercentage based on player dexterity
        // decreasing the hitPercentage based on attackType
        if(roll <= hitPercentage + 
            ((dexterity - dexterityCost) / 10) - (attackType * 5)) { // hit
            if(attackType == 2) {
                amount = this.damageAmount + (strength / 10) + 2 - weatherIntensity;
            }
            else {
                amount = this.damageAmount + (strength / 20) - weatherIntensity;
            }
        }
        // Double damage if the critical hit lands
        if (isCriticalHit) {
            amount *= 2;
        }
        return amount;
    } // strike() 
    
    public String getType() {
        return "Dagger";
    }
} // class