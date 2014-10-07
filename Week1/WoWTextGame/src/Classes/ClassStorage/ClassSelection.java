package Classes.ClassStorage;

import Classes.SpecificClasses.Mage;
import Classes.SpecificClasses.Warrior;
import Classes.*;

import java.util.Scanner;

/**
 * Created by Squall on 15/08/2014.
 */
public class ClassSelection {

    PlayerClass playerClass = getPlayerClass();
    PlayerClass enemyClass = getEnemyClass();
    StoredClasses stored = new StoredClasses();

    public static String plString = "Player";
    public static String enString = "Enemy";

    public void pickClass()
    {
        System.out.println("Please Choose a Class:");

        String classSelect;
        Scanner keyboard = new Scanner(System.in);
        classSelect = keyboard.nextLine();
        Classes selectedClass = Classes.valueOf(classSelect.toUpperCase());
        switch (selectedClass)
        {
            case WARRIOR:
                playerClass = new Warrior(stored.getStoredWarrior(1, plString));
                break;
            case MAGE:
                playerClass = new Mage(stored.getStoredMage());
                break;
        }
    }

    public void setEnemy()
    {
        enemyClass = new Warrior(stored.getStoredWarrior(1, enString));
    }

    public enum Classes
    {
        WARRIOR, MAGE, ROGUE, WARLOCK
    }

//    public void updateWarriorStats()
//    {
//        for (int i = 0; i < storedWarriorObjects.length; i++)
//        {
//            storedWarriorObjects[i].setStrength(storedWarriorObjects[i].getStrength() + this.storedWarriorObjects[i].getWeapon().getBonusStrength());
//            for (int j = 0; j < storedWarriorObjects[i].getSkillsLength(); j++)
//            {
//                storedWarriorObjects[i].getWarrSkills()[j].setRoughSkillDamageModified(storedWarriorObjects[i].getWeapon().getAverageDamage(),
//                        storedWarriorObjects[i].getWarrSkills()[j].getBaseDamage(), storedWarriorObjects[i].getStrength());
//            }
//        }
//    }

    public PlayerClass getPlayerClass()
    {
        return playerClass;
    }

    public PlayerClass getEnemyClass()
    {
        return enemyClass;
    }
}
