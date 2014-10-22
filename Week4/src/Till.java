/**
 * Created by Squall on 22/10/2014.
 */
public class Till implements PersonQueue {

    private Person shopperTail = null;
    private Person shopperHead = null;

    @Override
    public void insert(Person newPerson)
    {
        if (shopperHead == null)
        {
            shopperHead = newPerson;
            shopperTail = newPerson;
        }
        else
        {
            shopperTail.previousPerson = newPerson;
            newPerson.nextPerson = shopperTail;
            shopperTail = newPerson;
        }
    }

    @Override
    public Person retrieve()
    {
        if (shopperTail != null)
        {
            Person result = shopperHead;
            if (shopperHead.previousPerson != null)
            {
                shopperHead.previousPerson.nextPerson = null;
                shopperHead = shopperHead.previousPerson;
            }
            else
            {
                shopperHead = null;
                shopperTail = null;
            }
            System.out.println("Name of Person at Retrieved: " + result.name);
            return result;
        }
        else
        {
            return null;
        }
    }

    public void printHeadName()
    {
        System.out.println("Special Head Name: " + shopperHead.name);
    }

    public void printTailName()
    {
        System.out.println("Special Tail Name: " + shopperTail.name);
    }

}
