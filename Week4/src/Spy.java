/**
 * Created by Squall on 20/10/2014.
 */
public class Spy {
    private static int spyCount;

    public Spy()
    {
        spyCount++;
    }

    public static int getSpyCount()
    {
        return spyCount;
    }



}
