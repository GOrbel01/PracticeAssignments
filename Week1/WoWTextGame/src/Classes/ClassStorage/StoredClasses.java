package Classes.ClassStorage;

import java.util.Random;
import java.util.Scanner;
import Classes.*;
import Classes.SpecificClasses.*;
import Skills.SkillStorage.*;
import Weapons.WeaponStorage.*;

/**
 * Created by Squall on 15/08/2014.
 */
public class StoredClasses {
    StoredStrengthWeapons strWeaponStorage = new StoredStrengthWeapons();
    StoredIntWeapons intWeaponStorage = new StoredIntWeapons();

    StoredWarriorSkills warrSkillStorage = new StoredWarriorSkills();
    StoredMageSkills mageSkillStorage = new StoredMageSkills();

    Warrior warrior = new Warrior("Warrior", 50, 500, 140, 83, 100, strWeaponStorage.getStoredWeapons(2), warrSkillStorage.getStoredSkills());
    Warrior warriorb = new Warrior("Warrior", 36, 800, 200, 80, 100, strWeaponStorage.getStoredWeapons(1), warrSkillStorage.getStoredSkills());
    Warrior warriorc = new Warrior("Warrior", 42, 700, 155, 81, 100, strWeaponStorage.getStoredWeapons(0), warrSkillStorage.getStoredSkills());

    Mage mage = new Mage("Mage", 50, 500, 140, 84, 100, intWeaponStorage.getStoredWeapons(0), mageSkillStorage.getStoredSkills());
    Mage mageb = new Mage("Mage", 45, 722, 160, 98, 66, intWeaponStorage.getStoredWeapons(1), mageSkillStorage.getStoredSkills());
    Mage magec = new Mage("Mage", 65, 600, 180, 104, 66, intWeaponStorage.getStoredWeapons(2), mageSkillStorage.getStoredSkills());

    private Warrior[] storedWarriorObjects = {warrior, warriorb, warriorc};
    private Mage[] storedMageObjects = {mage, mageb, magec};

    public Warrior getStoredWarrior(String s)
    {
        int rn = getRandomNumber(storedWarriorObjects.length);
        Warrior[] temp = new Warrior[storedWarriorObjects.length];
        temp[rn] = new Warrior(storedWarriorObjects[rn]);
        temp[rn].setClassName(s + " " + temp[rn].getClassName());
        return temp[rn];
    }

    public Warrior getStoredWarrior(int i, String s)
    {
//        int rn = getRandomNumber(storedWarriorObjects.length);
        Warrior[] temp = new Warrior[storedWarriorObjects.length];
        temp[i] = new Warrior(storedWarriorObjects[i]);
        temp[i].setClassName(s + " " + temp[i].getClassName());
        return temp[i];
    }

    public Mage getStoredMage()
    {
        int rn = getRandomNumber(storedMageObjects.length);
        Mage[] temp = new Mage[storedMageObjects.length];
        temp[rn] = new Mage(storedMageObjects[rn]);
        return temp[rn];
    }

    public int getRandomNumber(int i)
    {
        Random rand = new Random();
        int c = rand.nextInt((i - 1) + 1) + 1;
        return c-1;
    }
}
