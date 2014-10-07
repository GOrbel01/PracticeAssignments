package Skills;

/**
 * Created by Squall on 15/08/2014.
 */
public class WarriorSkills extends Skills {
    private int rageCost;
    private double damageModified;

    public WarriorSkills()
    {

    }

    public WarriorSkills(String startName, int startCooldown, int startBaseDamage, int skillCost)
    {
        super(startName, startCooldown, startBaseDamage);
        this.rageCost = skillCost;
    }

    public WarriorSkills(WarriorSkills originalSkills)
    {
        super(originalSkills.getName(), originalSkills.getCooldown(), originalSkills.getBaseDamage(),originalSkills.getHasDamageOverTime());
        rageCost = originalSkills.rageCost;
    }

//    public void getRoughSkillDamageModified(Warrior plc) //By Armour/Weapon stats
//    {
//        damageModified = plc.getWeapon().getAverageDamage() + plc.getStrength();
//    }

    public void setRoughSkillDamageModified(double a, int baseDmg, int b)
    {
        damageModified = (a + b) * baseDmg;
    }

    public int getResourceCost()
    {
        return rageCost;
    }

    public String toString()
    {
        return ("Skill Name: " + getName() + "\nSkill Cooldown: "
                + getCooldown() + "\nSkill Damage: " + damageModified + "\nRage Cost: " + rageCost + "\n");
    }
}
