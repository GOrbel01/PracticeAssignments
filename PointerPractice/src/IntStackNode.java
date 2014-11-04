/**
 * Created by Squall on 04/11/2014.
 */
public class IntStackNode {
    private int value;
    private IntStackNode next;

    public IntStackNode(int newValue)
    {
        this.value = newValue;
    }

    public IntStackNode getNext()
    {
        return next;
    }

    public void setNext(IntStackNode next)
    {
        this.next = next;
    }

}
