package Skills.SkillStorage;

import Skills.MageSkills;

/**
 * Created by Squall on 15/08/2014.
 */
public class StoredMageSkills {
    MageSkills mageFrostbolt = new MageSkills("Frostbolt", 2, 55, 10);
    MageSkills mageLivingBomb = new MageSkills("Living Bomb", 2, 30, 10);
    MageSkills magePyroblast = new MageSkills("Pyroblast", 5, 15, 10);

    private MageSkills[] mageSkillsStored = {mageFrostbolt, mageLivingBomb, magePyroblast};

    public MageSkills[] getStoredSkills()
    {
        MageSkills[] temp = new MageSkills[mageSkillsStored.length];
        for (int i = 0; i < mageSkillsStored.length; i++)
        {
            temp[i] = new MageSkills(mageSkillsStored[i]);
        }
        return temp;
    }

    public MageSkills getSkills()
    {
        int i;
        for (i = 0; i < mageSkillsStored.length; i++)
        {
            if (i < mageSkillsStored.length - 1)
                return mageSkillsStored[i];
        }
        return mageSkillsStored[mageSkillsStored.length - 1];
    }

    public void printSkills()
    {
        for (int i = 0; i < mageSkillsStored.length; i++)
        {
            System.out.println(mageSkillsStored[i]);
        }
    }

    public MageSkills getStoredSkills(int i)
    {
        MageSkills[] temp = new MageSkills[mageSkillsStored.length];
        for (int j = 0; j < mageSkillsStored.length; j++)
        {
            temp[j] = new MageSkills(mageSkillsStored[j]);
        }
        return temp[i];
    }
}
