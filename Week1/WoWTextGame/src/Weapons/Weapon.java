package Weapons;

/**
 * Created by Squall on 15/08/2014.
 */
public abstract class Weapon {
    private String name;
    private int plusStamina;
    private int minDamage;
    private int maxDamage;
    private double speed;
    private double dps;

    protected Weapon(String startName, int startMinDmg, int startMaxDmg, double startSpeed)
    {
        double startDps = Math.round((((startMaxDmg - startMinDmg) / 2) + startMinDmg) / (startSpeed));

        this.name = startName;
        this.minDamage = startMinDmg;
        this.maxDamage = startMaxDmg;
        this.speed = startSpeed;
        this.dps = startDps;
    }

    private Weapon(Weapon originalWeapon)
    {
        this.dps = Math.round((((originalWeapon.maxDamage - originalWeapon.minDamage) / 2) + originalWeapon.minDamage) / originalWeapon.speed);

        this.name = originalWeapon.name;
        this.minDamage = originalWeapon.minDamage;
        this.maxDamage = originalWeapon.maxDamage;
        this.speed = originalWeapon.speed;
    }

    public double getAverageDamage()
    {
        return Math.round(((maxDamage - minDamage) / 2) + minDamage);
    }

    public String getName() {
        return name;
    }

    public void setName(String wepName) {
        this.name = wepName;
    }

    public int getPlusStamina() {
        return plusStamina;
    }

    public void setPlusStamina(int plusStam) {
        this.plusStamina = plusStam;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDmg) {
        this.minDamage = minDmg;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDmg) {
        this.maxDamage = maxDmg;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double wepSpeed) {
        this.speed = wepSpeed;
    }

    public double getDps() {
        return dps;
    }

    public void setDps(double wepDps) {
        this.dps = wepDps;
    }

    public abstract String toString();

}
