package Classes.SpecificClasses;

import Classes.*;
import Skills.WarriorSkills;
import Weapons.StrengthWeapon;

/**
 * Created by Squall on 15/08/2014.
 */
public class Warrior extends StrengthUser {
    private final int maxRage = 100;
    private int currentRage;
    private StrengthWeapon weapon;
    private WarriorSkills[] skills;

    public Warrior(Warrior originalObject)
    {
        super(originalObject.getClassName(), originalObject.getStamina(), originalObject.getBaseHealth(), originalObject.getResilience()
                , originalObject.getStrength());
        weapon = originalObject.weapon;
        for (int i = 0; i < originalObject.skills.length; i++)
        {
            this.skills = originalObject.skills;
        }
    }

    public Warrior(String name, int stam, int health, int resi, int str, int rage, StrengthWeapon warrWep, WarriorSkills[] warSkill)
    {
        super(name, stam, health, resi, str);
        for (int i = 0; i < warSkill.length; i++)
        {
            this.skills = warSkill;
        }
        this.weapon = warrWep;
    }

    public WarriorSkills[] getWarrSkills()
    {
        WarriorSkills[] temp = new WarriorSkills[skills.length];
        for (int i = 0; i < skills.length; i++)
        {
            temp[i] = new WarriorSkills(skills[i]);
        }
        return temp;
    }

    public int getSkillsLength()
    {
        return skills.length;
    }

    public StrengthWeapon getWeapon()
    {
        return this.weapon;
    }

    public void setWarriorWeapon(StrengthWeapon w)
    {
        this.weapon = w;
    }

    public int getMaxRage() {
        return maxRage;
    }

    public int getCurrentRage() {
        return currentRage;
    }

    public void setCurrentRage(int curRage) {
        this.currentRage = curRage;
    }

    public void updateStats()
    {
        this.setStrength(this.getStrength() + this.weapon.getBonusStrength());

        for (int i = 0; i < skills.length; i++)
        {
            this.skills[i].setRoughSkillDamageModified(weapon.getAverageDamage(),
                    skills[i].getBaseDamage(), getStrength());
        }
    }

    public void printAll()
    {
        System.out.println("\nClass Name: " + getClassName() + "\nStamina: " + getStamina() + "\nBase Health: "
                + getBaseHealth() + "\nResilience: " + getResilience() + "\nStrength: " + getStrength()
                + "\nMax Rage: " + getMaxRage() + "\n\n" + weapon.toString() + "\n");
        for (int i = 0; i < skills.length; i++)
        {
            System.out.println(skills[i]);
        }
    }

    public void useSkill(int i)
    {

    }

    public void onUseSkill(int i)
    {
        currentRage = currentRage - skills[i].getResourceCost();
        System.out.println(skills[i].getName() + ": Is now on Cooldown. " + skills[i].getCooldown() + " " +
                "turns until it can next be used");
    }
}
