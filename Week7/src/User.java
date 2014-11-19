public class User implements UserInterface
{
    private String name;
    private int ID;
    private Libary libary;
        
    public User(String setName)
    {
        this.name = setName;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getID()
    {
        return ID;
    }
    
    public void setID(int newID)
    {
        this.ID = newID;
    }
    
    public Libary getLibary()
    {
        return libary;
    }
    
    public void register(Libary newLib)
    {
        this.libary = newLib;
        setID(newLib.getID());
    }
}