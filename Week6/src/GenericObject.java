/**
 * Created by Squall on 03/11/2014.
 */
public class GenericObject<T> {
    private T value;
    private GenericObject next;
    private GenericObject previous;

    public GenericObject(T value)
    {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public GenericObject getNext()
    {
        return next;
    }

    public GenericObject getPrevious()
    {
        return previous;
    }
}
