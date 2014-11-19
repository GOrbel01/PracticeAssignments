/**
 * Created by Cloud on 05/11/2014.
 */
public class IntegerQueue implements QueueInterface {

    private IntQueueNode head;

    public void insert(int newNodeValue)
    {
        IntQueueNode newIntQueue = new IntQueueNode(newNodeValue);
        if (head != null)
        {
            newIntQueue.setNext(head);
        }
        head = newIntQueue;
    }

    public int retrieve()
    {
        boolean isDone = false;
        IntQueueNode point = head;
        int result = 0;
        while (!isDone)
        {
            if (point.getNext().getNext() == null)
            {
                result = point.getNext().getValue();
                point.setNext(null);
                isDone = true;
            }
            else
            {
                point = point.getNext();
            }
        }
        return result;
    }

    public IntQueueNode getLast()
    {
        boolean isDone = false;
        IntQueueNode point = head;
        while (!isDone)
        {
            if (point.getNext() == null)
            {
                isDone = true;
            } else
            {
                point = point.getNext();
            }
        }
        return point;
    }

    public int size()
    {
        int count = 0;
        boolean isDone = false;
        IntQueueNode point = head;
        while (!isDone)
        {
            if (point.getNext() == null)
            {
                count++;
                isDone = true;
            }
            else
            {
                count++;
                point = point.getNext();
            }
        }
        return count;
    }

    public IntQueueNode getHead()
    {
        return head;
    }
}
