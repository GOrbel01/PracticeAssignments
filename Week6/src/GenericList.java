/**
 * Created by Squall on 03/11/2014.
 */
public class GenericList<T> implements List<T> {

    private GenericObject first;

    public GenericObject add(T object)
    {
        boolean isDone = false;
        GenericObject point = first;
        if (first == null)
        {
            first = new GenericObject<T>(object);
            point = first;
        }
        else
        {
            while (!isDone)
            {
                if (point.getNext() == null)
                {
                    point.setNext(new GenericObject<T>(object));
                    point.getNext().setPrevious(point);
                    isDone = true;
                }
                else
                {
                    point = point.getNext();
                }
            }
        }
       return point;
    }



    public void remove(int index)
    {
        boolean isDone = false;
        int count = 0;
        GenericObject point = first;
        while(!isDone)
        {
            if(index == count)
            {
                point.getNext().setPrevious(point.getPrevious());
                point.getPrevious().setNext(point.getNext());
                point.setNext(null);
                point.setPrevious(null);
                isDone = true;
            }
            else
            {
                count++;
                point = point.getNext();
            }
        }
    }

    public void printBackToFront()
    {
        boolean isDone = false;
        GenericObject point = getListEnd();
        while (!isDone)
        {
            if (point.getPrevious() == null)
            {
                System.out.println("Name: " + point.getValue());
                isDone = true;
            }
            else
            {
                System.out.println("Name: " + point.getValue());
                point = point.getPrevious();
            }
        }
    }

    public int size()
    {
        boolean isDone = false;
        int count = 0;
        GenericObject point = first;
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

    public GenericObject get(int index)
    {
        boolean isDone = false;
        int count = 0;
        GenericObject point = first;
        while(!isDone)
        {
            if(index == count)
            {
                isDone = true;
            }
            else
            {
                count++;
                point = point.getNext();
            }
        }
        return point;
    }

    public GenericObject getFirst()
    {
        return first;
    }

    public GenericObject getListEnd()
    {
        boolean isDone = false;
        GenericObject tail = first;
        while (!isDone)
        {
            if (tail.getNext() == null)
            {
                isDone = true;
            }
            else
            {
                tail = tail.getNext();
            }
        }
        return tail;
    }
}
