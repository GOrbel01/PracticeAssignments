/**
 * Created by Squall on 29/10/2014.
 */
public class Insect extends Animal {

    public Insect(String name)
    {
        super(name);
    }

    @Override
    public void reproduce()
    {
        layEggs();
    }

    private void layEggs()
    {

    }
}
