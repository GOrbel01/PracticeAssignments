package Weapons.WeaponStorage;

import Weapons.StrengthWeapon;

/**
 * Created by Squall on 15/08/2014.
 */
public class StoredStrengthWeapons {

    StrengthWeapon strengthWeapon = new StrengthWeapon("Sword of Gods", 54, 77, 3.50, 15);
    StrengthWeapon strengthWeaponB = new StrengthWeapon("Sword of Hellfire", 44, 88, 3.50, 17);
    StrengthWeapon strengthWeaponC = new StrengthWeapon("Sword of Angelic Vigor", 77, 92, 3.50, 16);

    private StrengthWeapon[] strWeaponsStored = {strengthWeapon, strengthWeaponB, strengthWeaponC};

    public StrengthWeapon[] getStoredWeapons()
    {
        StrengthWeapon[] temp = new StrengthWeapon[strWeaponsStored.length];
        for (int i = 0; i < strWeaponsStored.length; i++)
        {
            temp[i] = new StrengthWeapon(strWeaponsStored[i]);
        }
        return temp;
    }

    public StrengthWeapon getStoredWeapons(int i)
    {
        StrengthWeapon[] temp = new StrengthWeapon[strWeaponsStored.length];
        for (int j = 0; j < strWeaponsStored.length; j++)
        {
            temp[j] = new StrengthWeapon(strWeaponsStored[j]);
        }
        return temp[i];
    }

    public StrengthWeapon getSpecificWeapon(int i)
    {
        if ((i < 0) || (i > strWeaponsStored.length - 1))
        {
            System.out.println("Error, Illegal Array Value");
            return null;
        }
        else
            return new StrengthWeapon(strWeaponsStored[i]);
    }
}
