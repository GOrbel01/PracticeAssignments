/**
 * Created by Squall on 29/10/2014.
 */
public class Lecturer extends Teacher{

    public Lecturer(String name)
    {
        super(name);
    }

    public void doResearch(String topic)
    {
        System.out.println("Doing research on: " + topic);
    }
}
