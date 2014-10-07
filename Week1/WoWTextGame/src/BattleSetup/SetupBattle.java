package BattleSetup;

import Classes.ClassStorage.ClassSelection;

/**
 * Created by Squall on 25/08/2014.
 */
public class SetupBattle {

    public static ClassSelection cls = new ClassSelection();

    public static void main(String[] args)
    {
        cls.pickClass();

        cls.getPlayerClass().updateStats();

        cls.getPlayerClass().printAll();

        cls.setEnemy();

        cls.getEnemyClass().updateStats();

        cls.getEnemyClass().printAll();

        cls.getEnemyClass().setCurHealth(cls.getEnemyClass().getCurHealth() - 70);

        System.out.println(cls.getEnemyClass().getCurHealth());

        System.out.println(cls.getPlayerClass().getCurHealth());

        cls.getEnemyClass().printAll();
    }
}
