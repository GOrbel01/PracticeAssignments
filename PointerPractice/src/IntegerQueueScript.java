/**
 * Created by Cloud on 05/11/2014.
 */
public class IntegerQueueScript {
    public static void main(String[] args)
    {
        IntegerQueueScript iqscr = new IntegerQueueScript();
        iqscr.launch();
    }

    public void launch()
    {
        IntegerQueue intQueue = new IntegerQueue();
        testQueue(intQueue);
    }

    public void testQueue(QueueInterface queue)
    {
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        System.out.println(queue.getLast().getValue());
        queue.retrieve();
        System.out.println(queue.getLast().getValue());
    }
}
