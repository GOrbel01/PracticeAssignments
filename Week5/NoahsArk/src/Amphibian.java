/**
 * Created by Squall on 29/10/2014.
 */
abstract class Amphibian extends Animal {

    public Amphibian(String name)
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
