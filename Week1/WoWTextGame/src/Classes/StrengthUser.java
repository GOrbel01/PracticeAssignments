package Classes;

/**
 * Created by Squall on 15/08/2014.
 */
public abstract class StrengthUser extends PlayerClass {
    private int strength;

    public StrengthUser(String name, int stam, int bHealth, int resi, int str)
    {
        super(name, stam, bHealth, resi);
        if (str >= 0)
        {
            this.strength = str;
        }
        else
        {
            System.out.println("Negative Value Entered");
            System.out.println("Error creating class");
            System.exit(0);
        }
    }

    public void setStrength(int str)
    {
        this.strength = str;
    }

    public int getStrength()
    {
        return strength;
    }

    public abstract void printAll();

    public abstract void updateStats();

    public abstract void onUseSkill(int i);

    public abstract void useSkill(int i);
}
