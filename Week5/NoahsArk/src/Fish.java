/**
 * Created by Squall on 29/10/2014.
 */
public class Fish extends Animal {

    public Fish(String name)
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
