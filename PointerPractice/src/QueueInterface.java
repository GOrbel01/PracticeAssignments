/**
 * Created by Cloud on 04/11/2014.
 */
public interface QueueInterface {

    void insert(int newNodeValue);

    int retrieve();

    int size();

    IntQueueNode getHead();

    IntQueueNode getLast();
}
