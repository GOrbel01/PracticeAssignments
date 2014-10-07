package Classes.SpecificClasses;

import Classes.*;
import Skills.MageSkills;
import Weapons.IntelWeapon;
import Weapons.StrengthWeapon;

/**
 * Created by Squall on 15/08/2014.
 */
public class Mage extends IntUser {

    private IntelWeapon weapon;
    private MageSkills[] skills;

    public Mage(Mage originalObject)
    {
        super(originalObject.getClassName(), originalObject.getStamina(), originalObject.getBaseHealth(), originalObject.getResilience()
                , originalObject.getIntelligence(), originalObject.getMaxMana());
        weapon = originalObject.weapon;
        skills = originalObject.skills;
    }

    public Mage(String name, int stam, int health, int resi, int intelligence, int maxMana, IntelWeapon magWep, MageSkills[] magSkill)
    {
        super(name, stam, health, resi, intelligence, maxMana);
        for (int i = 0; i < magSkill.length; i++)
        {
            this.skills = magSkill;
        }
        this.weapon = magWep;
    }

    public void updateStats()
    {
        this.setIntelligence(this.getIntelligence() + this.weapon.getBonusIntelligence());

        for (int i = 0; i < skills.length; i++)
            this.skills[i].setRoughSkillDamageModified(weapon.getAverageDamage(), skills[i].getBaseDamage(), getIntelligence());
    }

    public void printAll()
    {
        System.out.println("\nClass Name: " + getClassName() + "\nStamina: " + getStamina() + "\nBase Health: "
                + getBaseHealth() + "\nResilience: " + getResilience() + "\nIntelligence: " + getIntelligence()
                + "\nMax Mana: " + getMaxMana() + "\n\n" + weapon.toString() + "\n");
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
        setCurrentMana(getCurrentMana() - skills[i].getResourceCost());
        System.out.println(skills[i].getName() + ": Is now on Cooldown. " + skills[i].getCooldown() + " " +
                "turns until it can next be used");
    }

}
