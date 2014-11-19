/**
 * Created by Squall on 03/11/2014.
 */
public interface List<T> {

    GenericObject add(T object);

    void remove(int index);

    int size();

    GenericObject get(int index);

    GenericObject getListEnd();

}
