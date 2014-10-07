package Skills;

/**
 * Created by Squall on 15/08/2014.
 */
public class MageSkills extends Skills {
    private int manaCost;
    private double damageModified;

    public MageSkills(String startName, int startCooldown, int startBaseDamage, int skillCost)
    {
        super(startName, startCooldown, startBaseDamage);
        this.manaCost = skillCost;
    }

    public MageSkills(MageSkills originalSkills)
    {
        super(originalSkills.getName(), originalSkills.getCooldown(), originalSkills.getBaseDamage());
        manaCost = originalSkills.manaCost;
    }

//    public void getRoughSkillDamageModified(Warrior plc) //By Armour/Weapon stats
//    {
//        damageModified = plc.getWeapon().getAverageDamage() + plc.getStrength();
//    }

    public void setRoughSkillDamageModified(double avgWepDmg, int baseSkillDamage, int sP)
    {
        damageModified = (avgWepDmg + sP) * baseSkillDamage;
    }

    public String toString()
    {
        return ("Skill Name: " + getName() + "\nSkill Cooldown: "
                + getCooldown() + "\nSkill Damage: " + damageModified + "\nMana Cost: " + manaCost + "\n");
    }

    public int getResourceCost()
    {
        return manaCost;
    }
}
