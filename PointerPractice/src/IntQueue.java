/**
 * Created by Cloud on 01/11/2014.
 */
public class IntQueue {
    private int value;
    private IntQueue head;
    private IntQueue tail;
    private IntQueue next;

    public IntQueue()
    {

    }

    public IntQueue(int value)
    {
        this.value = value;
        this.head = null;
        this.tail = null;
    }

    public void insert(IntQueue newElement)
    {
        IntQueue temp = this;
        if (next == null)
        {
            this.head = newElement;
        }
        else
        {
            this.head = newElement;
            this.head.next = temp;
        }
    }

    public int getValue()
    {
        return value;
    }

    public IntQueue getHead()
    {
        return head;
    }

    public IntQueue getTail()
    {
        return tail;
    }

    public IntQueue getNext()
    {
        return next;
    }

    public void addFirstElement(IntQueue firstElement)
    {
        this.head = firstElement;
    }

}
