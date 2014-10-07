package Classes;

/**
 * Created by Squall on 15/08/2014.
 */
public abstract class IntUser extends PlayerClass {
    private int intelligence;
    private int maxMana;
    private int currentMana;

    public IntUser(String name, int stam, int bHealth, int resi, int intel, int manaMax)
    {
        super(name, stam, bHealth, resi);
        if (intel >= 0 && manaMax >= 0)
        {
            this.intelligence = intel;
            this.maxMana = manaMax;
        }
        else
        {
            System.out.println("Error creating class");
            System.exit(0);
        }
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intel) {
        this.intelligence = intel;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(int newMaxMana) {
        this.maxMana = newMaxMana;
    }

    public int getCurrentMana() {
        return currentMana;
    }

    public void setCurrentMana(int curMana) {
        this.currentMana = curMana;
    }

    public abstract void printAll();

    public abstract void updateStats();

    public abstract void useSkill(int i);

    public abstract void onUseSkill(int i);

}
