/**
 * Created by Squall on 29/10/2014.
 */
public class Reptile extends Animal {

    public Reptile(String name)
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
