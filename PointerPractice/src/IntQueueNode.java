/**
 * Created by Cloud on 04/11/2014.
 */
public class IntQueueNode {
    private int value;
    private IntQueueNode next;

    public IntQueueNode(int newValue)
    {
        this.value = newValue;
    }

    public IntQueueNode getNext()
    {
        return next;
    }

    public void setNext(IntQueueNode next)
    {
        this.next = next;
    }

    public int getValue()
    {
        return value;
    }
}
