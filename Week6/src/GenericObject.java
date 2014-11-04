/**
 * Created by Squall on 03/11/2014.
 */
public class GenericObject<T> {
    private T value;
    private T secondValue;
    private T thirdValue;
    private GenericObject next;
    private GenericObject previous;

    public GenericObject()
    {

    }

    public GenericObject(T value)
    {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public GenericObject(T value, T secondValue, T thirdValue)
    {
        this.value = value;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public GenericObject getNext()
    {
        return next;
    }

    public void setNext(GenericObject next)
    {
        this.next = next;
    }

    public GenericObject getPrevious()
    {
        return previous;
    }

    public void setPrevious(GenericObject prev)
    {
        this.previous = prev;
    }

    public T getValue()
    {
        return value;
    }

    public T getSecondValue()
    {
        return secondValue;
    }

    public T getThirdValue()
    {
        return thirdValue;
    }
}
