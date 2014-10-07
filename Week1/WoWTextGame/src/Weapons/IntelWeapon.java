package Weapons;

/**
 * Created by Squall on 15/08/2014.
 */
public class IntelWeapon extends Weapon {

    private int bonusIntelligence;
    private int spellPower;

    public IntelWeapon(String startName, int startMinDmg, int startMaxDmg, double startSpeed, int bonusIntel, int sP)
    {
        super(startName, startMinDmg, startMaxDmg, startSpeed);
        if ((startMinDmg > 0) && (startMaxDmg > 0) && (startSpeed > 0) && (sP > 0) && (bonusIntel > 0)) {
            this.bonusIntelligence = bonusIntel;
            this.spellPower = sP;

        } else {
            System.out.println("Error creating class");
            System.exit(0);
        }
    }

    public IntelWeapon(IntelWeapon originalWeapon)
    {
        super(originalWeapon.getName(), originalWeapon.getMinDamage(), originalWeapon.getMaxDamage(), originalWeapon.getSpeed());
        if ((originalWeapon.getMinDamage() > 0) && (originalWeapon.getMaxDamage() > 0) && (originalWeapon.getSpeed() > 0) &&
                (originalWeapon.bonusIntelligence >= 0) && (originalWeapon.spellPower >= 0)) {
            bonusIntelligence = originalWeapon.bonusIntelligence;
            spellPower = originalWeapon.spellPower;

        } else {
            System.out.println("Error creating class");
            System.exit(0);
        }
    }

    public int getBonusIntelligence() {
        return bonusIntelligence;
    }

    public void setBonusIntelligence(int newBonusIntelligence) {
        this.bonusIntelligence = newBonusIntelligence;
    }

    public int getSpellPower()
    {
        return spellPower;
    }

    public void setSpellPower(int newSP)
    {
        this.spellPower = newSP;
    }

    public String toString()
    {
        return ("Weapon Name: " + getName() + "\nAverage Dmg: " + getAverageDamage() +
                "\nWeapon Speed (Swings Per Second): " + getSpeed() + "\nAverage Weapon Damage Per Second: " + getDps()
                + "\nBonus Intelligence: " + bonusIntelligence + "\nSpellpower: " + spellPower);
    }
}
