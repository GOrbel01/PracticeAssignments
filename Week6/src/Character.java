/**
 * Created by Squall on 04/11/2014.
 */
public class Character {
    public String name;
    public int health;
    public int agility;

    public Character(String name, int health, int agility)
    {
        this.name = name;
        this.health = health;
        this.agility = agility;
    }

    public String getName()
    {
        return name;
    }

}
