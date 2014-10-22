/**
 * Created by Squall on 22/10/2014.
 */
public class Supermarket {
    private Till till1 = new Till();
    private Till till2 = new Till();
    private Till till3 = new Till();

    public static void main(String[] args)
    {
        Supermarket sm = new Supermarket();
        sm.launch();
    }

    public void launch()
    {
        Person firstPerson = new Person(15, "James");
        Person secondPerson = new Person(19, "John");
        Person thirdPerson = new Person(29, "Beth");
        addPerson(firstPerson);
        addPerson(secondPerson);
        addPerson(thirdPerson);
        till1.printHeadName();
        till1.printTailName();
        servePerson();
        till1.printHeadName();
        till1.printTailName();
        servePerson();
        till1.printHeadName();
        till1.printTailName();
        servePerson();
        till1.printHeadName();
        till1.printTailName();
        servePerson();
        till1.printHeadName();
        till1.printTailName();
    }

    public void addPerson(Person newPerson)
    {
        till1.insert(newPerson);
    }

    public void servePerson()
    {
        till1.retrieve();
    }
}
