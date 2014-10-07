package Skills;

/**
 * Created by Squall on 15/08/2014.
 */
public abstract class Skills {
    private String name;
    private int cooldown;
    private int baseDamage;
    private int remainingCooldown;
    private boolean hasDamageOverTime;

    protected Skills()
    {

    }

    protected Skills(Skills theSkill)
    {
        name = theSkill.name;
        cooldown = theSkill.cooldown;
        baseDamage = theSkill.baseDamage;
        hasDamageOverTime = theSkill.hasDamageOverTime;
    }

    public void updateCooldown()
    {
        if (remainingCooldown > 0)
            remainingCooldown = remainingCooldown - 1;
    }

    public boolean isOffCooldown()
    {
        return remainingCooldown <= 0;
    }

    public Skills(String startName, int startCooldown, int startBaseDamage, boolean hasDot)
    {
        this.name = startName;
        this.cooldown = startCooldown;
        this.baseDamage = startBaseDamage;
        this.hasDamageOverTime = hasDot;
    }

    public Skills(String startName, int startCooldown, int startBaseDamage)
    {
        this.name = startName;
        this.cooldown = startCooldown;
        this.baseDamage = startBaseDamage;
    }

    public String getName()
    {
        return this.name;
    }

    public int getCooldown()
    {
        return this.cooldown;
    }

    public int getBaseDamage()
    {
        return this.baseDamage;
    }

    public int getRemainingCooldown()
    {
        return this.remainingCooldown;
    }

    public void setRemainingCooldown(int rC)
    {
        this.remainingCooldown = rC;
    }

    public boolean getHasDamageOverTime()
    {
        return hasDamageOverTime;
    }

    public String toString()
    {
        return ("Skill Name: " + name + "\nSkill Cooldown: " + cooldown + "\nSkill Damage Base: " + baseDamage);
    }

    public abstract int getResourceCost();
}
