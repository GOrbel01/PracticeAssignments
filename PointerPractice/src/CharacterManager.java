/**
 * Created by Cloud on 28/10/2014.
 */
public class CharacterManager {
    private Character firstCharacter;

    public static void main(String[] args)
    {
        CharacterManager cmgr = new CharacterManager();
        cmgr.launch();
    }

    public void launch()
    {
        Character cloud = new Character("Cloud", 20, 100);
        Character tifa = new Character("Tifa", 18, 80);
        Character vincent = new Character("Vincent", 22, 90);
        Character lucrecia = new Character("Lucrecia", 18, 80);
        Character squall = new Character("Squall", 15, 120);
        Character rinoa = new Character("Rinoa", 18, 80);
        Character zidane = new Character("Zidane", 12, 140);
        Character garnet = new Character("Garnet", 18, 80);
        Character tidus = new Character("Tidus", 13, 145);
        Character yuna = new Character("Yuna", 18, 80);
        Character eminem = new Character("Eminem", 1, 1);
        firstCharacter = cloud;
        firstCharacter.addCharacter(vincent);
        firstCharacter.addCharacter(lucrecia);
        firstCharacter.addCharacter(tifa);
        firstCharacter.addCharacter(squall);
        firstCharacter.addCharacter(rinoa);
        firstCharacter.addCharacter(zidane);
        firstCharacter.addCharacter(garnet);
        firstCharacter.addCharacter(tidus);
        firstCharacter.addCharacter(yuna);

        firstCharacter.printBackToFront();
        System.out.println();

        firstCharacter.deleteCharacter(eminem);

//        firstCharacter.printBackToFront();

//        System.out.println("Tail: " + firstCharacter.getTail().getName());

        firstCharacter.printBackToFront();
        System.out.println();
        firstCharacter.printFrontToBack();
    }
}
