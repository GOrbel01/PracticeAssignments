/**
 * Created by Squall on 27/10/2014.
 */
public interface IntSet {

    //Adds a new int to the set; if it already exists in the set, nothing happens
    public void add(int i);

    //Returns true if the number is in the set, false otherwise.
    public boolean contains(int i);

    //Returns the same values as the former method but for every element that is checked it
    //Prints its value on the screen.
    public boolean containsVerbose(int i);

    //Returns a String with the values of the elements in the set separated by commas.
    public String toString();

}
