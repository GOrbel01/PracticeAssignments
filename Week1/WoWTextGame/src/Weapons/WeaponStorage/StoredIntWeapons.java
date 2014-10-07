package Weapons.WeaponStorage;

import Weapons.IntelWeapon;

/**
 * Created by Squall on 15/08/2014.
 */
public class StoredIntWeapons {
    IntelWeapon intelWeapon = new IntelWeapon("Staff of Gods", 54, 77, 3.50, 15, 123);
    IntelWeapon intelWeaponB = new IntelWeapon("Staff of Hellfire", 44, 88, 3.50, 17, 100);
    IntelWeapon intelWeaponC = new IntelWeapon("Staff of Angelic Vigor", 77, 92, 3.50, 16, 104);

    private IntelWeapon[] intelWeaponsStored = {intelWeapon, intelWeaponB, intelWeaponC};

    public IntelWeapon[] getStoredWeapons()
    {
        IntelWeapon[] temp = new IntelWeapon[intelWeaponsStored.length];
        for (int i = 0; i < intelWeaponsStored.length; i++)
        {
            temp[i] = new IntelWeapon(intelWeaponsStored[i]);
        }
        return temp;
    }

    public IntelWeapon getStoredWeapons(int i)
    {
        IntelWeapon[] temp = new IntelWeapon[intelWeaponsStored.length];
        for (int j = 0; j < intelWeaponsStored.length; j++)
        {
            temp[j] = new IntelWeapon(intelWeaponsStored[j]);
        }
        return temp[i];
    }

    public IntelWeapon getSpecificWeapon(int i)
    {
        if ((i < 0) || (i > intelWeaponsStored.length - 1))
        {
            System.out.println("Error, Illegal Array Value");
            return null;
        }
        else
            return new IntelWeapon(intelWeaponsStored[i]);
    }
}
