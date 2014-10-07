package Skills.SkillStorage;

import Skills.WarriorSkills;

/**
 * Created by Squall on 15/08/2014.
 */
public class StoredWarriorSkills {
    WarriorSkills warrHeroicStrike = new WarriorSkills("Heroic Strike", 2, 2, 10);
    WarriorSkills warrRend = new WarriorSkills("Rend", 2, 1, 10);
    WarriorSkills thunderClap = new WarriorSkills("Thunder Clap", 5, 2, 10);

    private WarriorSkills[] warrSkillsStored = {warrHeroicStrike, warrRend, thunderClap};

    public WarriorSkills[] getStoredSkills()
    {
        WarriorSkills[] temp = new WarriorSkills[warrSkillsStored.length];
        for (int i = 0; i < warrSkillsStored.length; i++)
        {
            temp[i] = new WarriorSkills(warrSkillsStored[i]);
        }
        return temp;
    }

    public void printSkills()
    {
        for (int i = 0; i < warrSkillsStored.length; i++)
        {
            System.out.println(warrSkillsStored[i]);
        }
    }

    public WarriorSkills getStoredSkills(int i)
    {
        WarriorSkills[] temp = new WarriorSkills[warrSkillsStored.length];
        for (int j = 0; j < warrSkillsStored.length; j++)
        {
            temp[j] = new WarriorSkills(warrSkillsStored[j]);
        }
        return temp[i];
    }
}
