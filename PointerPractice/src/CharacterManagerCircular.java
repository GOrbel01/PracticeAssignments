/**
 * Created by Cloud on 31/10/2014.
 */
public class CharacterManagerCircular {
    private CharacterCircular firstCharacter;

    public static void main(String[] args) {
        CharacterManagerCircular cmgrc = new CharacterManagerCircular();
        cmgrc.launch();
    }

    public void launch() {
        CharacterCircular cloud = new CharacterCircular("Cloud", 20, 100);
        CharacterCircular tifa = new CharacterCircular("Tifa", 18, 80);
        CharacterCircular vincent = new CharacterCircular("Vincent", 22, 90);
        CharacterCircular lucrecia = new CharacterCircular("Lucrecia", 18, 80);
        CharacterCircular squall = new CharacterCircular("Squall", 15, 120);
        CharacterCircular rinoa = new CharacterCircular("Rinoa", 18, 80);
        CharacterCircular zidane = new CharacterCircular("Zidane", 12, 140);
        CharacterCircular garnet = new CharacterCircular("Garnet", 18, 80);
        CharacterCircular tidus = new CharacterCircular("Tidus", 13, 145);
        CharacterCircular yuna = new CharacterCircular("Yuna", 18, 80);
        CharacterCircular eminem = new CharacterCircular("Eminem", 1, 1);
        firstCharacter = cloud;
        firstCharacter.addCharacter(tifa);
        firstCharacter.addCharacter(vincent);
        firstCharacter.addCharacter(lucrecia);
        firstCharacter.addCharacter(squall);
        firstCharacter.addCharacter(rinoa);
        firstCharacter.addCharacter(zidane);
        firstCharacter.addCharacter(garnet);
        firstCharacter.addCharacter(tidus);
        firstCharacter.addCharacter(yuna);

        firstCharacter.deleteCharacter(lucrecia);
        firstCharacter.deleteCharacter(squall);

        System.out.println(firstCharacter.getNextCharacter().getNextCharacter().getNextCharacter().getName());
    }
}