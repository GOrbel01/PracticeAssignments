/**
 * Created by Cloud on 01/11/2014.
 */
public class IntQueueManager {
    private IntQueue iqStart;
    public static void main(String[] args)
    {
        IntQueueManager iqm = new IntQueueManager();

        iqm.launch();
    }

    public void launch()
    {
        IntQueue iq1 = new IntQueue(1);
        IntQueue iq2 = new IntQueue(2);
        IntQueue iq3 = new IntQueue(3);
        IntQueue iq4 = new IntQueue(4);
        IntQueue iq5 = new IntQueue(5);
        IntQueue iq6 = new IntQueue(6);

        iqStart = iq1;
        iqStart.addFirstElement(iq1);

//        System.out.println(iqStart.getHead().getValue());
        iqStart.insert(iq2);
        System.out.println(iqStart.getHead().getValue());
        iqStart.insert(iq3);
        System.out.println(iqStart.getHead().getValue());
        iqStart.insert(iq4);
        System.out.println(iqStart.getHead().getValue());

        System.out.println(iqStart.getHead().getNext().getValue());
    }
}
