/**
 * Created by Cloud on 31/10/2014.
 */
public class CharacterCircular {

        private String name;
        private int strength;
        private int health;
        private CharacterCircular nextCharacter;

        public CharacterCircular()
        {

        }

        public CharacterCircular(String name, int str, int health)
        {
            this.name = name;
            this.strength = str;
            this.health = health;
            this.nextCharacter = null;
        }

        public void addCharacter(CharacterCircular newCharacter)
        {
            boolean isDone = false;
            CharacterCircular head = this;
            CharacterCircular point = this;
            while (!isDone)
            {
                if (this.nextCharacter == null)
                {
                    System.out.println("Here");
                    this.nextCharacter = newCharacter;
                    nextCharacter.nextCharacter = this;
                }
                else
                {
                    if (point.nextCharacter.name.equals(head.name))
                    {
                        point.nextCharacter = newCharacter;
                        point.nextCharacter.nextCharacter = head;
                        isDone = true;
                    }
                    else
                    {
                        point = point.nextCharacter;
                    }
                }
            }
        }

        public void deleteCharacter(CharacterCircular character)
        {
            boolean isDone = false;
            CharacterCircular head = this;
            CharacterCircular point = this;
            while (!isDone)
            {
                if (character.name.equals(point.nextCharacter.name))
                {
                    point = this;
                    point.nextCharacter = point.nextCharacter.nextCharacter;
                    isDone = true;
                }
                else
                {
                    point = point.nextCharacter;
                }
            }
        }

//        public void printBackToFront()
//        {
//            boolean isDone = false;
//            CharacterCircular point = getListEnd();
//            while (!isDone)
//                if (point.previousCharacter == null)
//                {
//                    System.out.println("Name: " + this.name);
//                    isDone = true;
//                }
//                else
//                {
//                    System.out.println("Name: " + point.name);
//                    point = point.previousCharacter;
//                }
//        }

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

        public CharacterCircular getNextCharacter()
        {
            return nextCharacter;
        }

//        public CharacterCircular getPreviousCharacter()
//        {
//            return previousCharacter;
//        }

        public String getName()
        {
            return name;
        }
}
