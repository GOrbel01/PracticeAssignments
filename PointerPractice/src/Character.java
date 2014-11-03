/**
 * Created by Cloud on 28/10/2014.
 */
public class Character {
    private String name;
    private int strength;
    private int health;
    private Character nextCharacter;
    private Character previousCharacter;

    public Character()
    {

    }

    public Character(String name, int str, int health)
    {
        this.name = name;
        this.strength = str;
        this.health = health;
        this.nextCharacter = null;
        this.previousCharacter = null;
    }

    public void addCharacter(Character newCharacter)
    {
        if (this.nextCharacter == null)
        {
            this.nextCharacter = newCharacter;
            this.nextCharacter.previousCharacter = this;
        }
        else
        {
            this.nextCharacter.addCharacter(newCharacter);
            this.nextCharacter.previousCharacter = this;
        }
    }

    public boolean deleteCharacter(Character character)
    {
        if (this.nextCharacter == null)
        {
            return false;
        }
        else if (character.name.equals(this.name))
        {
            this.nextCharacter.previousCharacter = this.previousCharacter;
            this.previousCharacter.nextCharacter = this.nextCharacter;
            return true;
        }
        else
        {
            return this.nextCharacter.deleteCharacter(character);
        }
    }

    public void printBackToFront()
    {
        boolean isDone = false;
        Character point = getListEnd();
        while (!isDone)
        if (point.previousCharacter == null)
        {
            System.out.println("Name: " + this.name);
            isDone = true;
        }
        else
        {
            System.out.println("Name: " + point.name);
            point = point.previousCharacter;
        }
    }

    public void printFrontToBack()
    {
        if (this.nextCharacter == null)
        {
            System.out.println("Name: " + this.name);
        }
        else
        {
            System.out.println("Name: " + this.name);
            this.nextCharacter.printFrontToBack();
        }
    }

    public String toString()
    {
        return ("\nCharacter: \n" + "Name: " + name + "\nStrength: " + strength + "\nHealth: " + health);
    }

    public Character getNextCharacter()
    {
        return nextCharacter;
    }

    public Character getPreviousCharacter()
    {
        return previousCharacter;
    }

    public Character getListEnd()
    {
        Character tail = new Character();
        if (this.nextCharacter == null)
        {
            tail = this;
            return tail;
        }
        else
        {
                tail = this.nextCharacter.getListEnd();
                return tail;
        }
    }

    public String getName()
    {
        return name;
    }
}
