package Classes;

/**
 * Created by Squall on 15/08/2014.
 */
public abstract class PlayerClass {
    private String className;
    private int baseHealth;
    private int curHealth;
    private int stamina;
    private int resilience;

    protected PlayerClass()
    {

    }

    protected PlayerClass(String name, int stam, int bHealth, int resi)
    {
        this.className = name;
        this.stamina = stam;
        this.baseHealth = bHealth;
        this.resilience = resi;
        this.curHealth = baseHealth;
    }

    protected PlayerClass(PlayerClass originalObject)
    {
        className = originalObject.className;
        stamina = originalObject.stamina;
        baseHealth = originalObject.baseHealth;
        resilience = originalObject.resilience;
    }


    public int getResilience() {
        return resilience;
    }

    public void setResilience(int resi) {
        this.resilience = resi;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stam) {
        this.stamina = stam;
    }

    public int getCurHealth() {
        return curHealth;
    }

    public void setCurHealth(int hp) {
        this.curHealth = hp;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String cn) {
        this.className = cn;
    }

    public int getBaseHealth()
    {
        return baseHealth;
    }

    public void setBaseHealth(int bHealth)
    {
        this.baseHealth = bHealth;
    }

    public abstract void printAll();

    public abstract void updateStats();

    public abstract void onUseSkill(int i);

    public abstract void useSkill(int i);

}
