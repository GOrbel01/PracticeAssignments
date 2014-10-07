package Weapons;

/**
 * Created by Squall on 15/08/2014.
 */
public class StrengthWeapon extends Weapon {

    private int bonusStrength;

    public StrengthWeapon(String startName, int startMinDmg, int startMaxDmg, double startSpeed, int bonusStr)
    {
        super(startName, startMinDmg, startMaxDmg, startSpeed);
        if ((startMinDmg > 0) && (startMaxDmg > 0) && (startSpeed > 0)) {
            this.bonusStrength = bonusStr;

        } else {
            System.out.println("Error creating class");
            System.exit(0);
        }
    }

    public StrengthWeapon(StrengthWeapon originalWeapon)
    {
        super(originalWeapon.getName(), originalWeapon.getMinDamage(), originalWeapon.getMaxDamage(), originalWeapon.getSpeed());
        if ((originalWeapon.getMinDamage() > 0) && (originalWeapon.getMaxDamage() > 0) && (originalWeapon.getSpeed() > 0)) {
            bonusStrength = originalWeapon.bonusStrength;

        } else {
            System.out.println("Error creating class");
            System.exit(0);
        }
    }

    public int getBonusStrength() {
        return bonusStrength;
    }

    public void setBonusStrength(int newBonusStrength) {
        this.bonusStrength = newBonusStrength;
    }

    public String toString()
    {
        return ("Weapon Name: " + getName() + "\nAverage Dmg: " + getAverageDamage() +
                "\nWeapon Speed (Swings Per Second): " + getSpeed() + "\nAverage Weapon Damage Per Second: " + getDps()
                + "\nBonus Strength: " + bonusStrength);
    }

}
