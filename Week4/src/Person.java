/**
 * Created by Squall on 22/10/2014.
 */
public class Person {
    //Note a Constructor ONLY and Public Fields
    public int age;
    public String name;
    public Person nextPerson;
    public Person previousPerson;

    public Person(int age, String name)
    {
        this.age = age;
        this.name = name;
        this.nextPerson = null;
        this.previousPerson = null;
    }
}
