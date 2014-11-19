public interface UserInterface
{    
    String getName();
    
    int getID();
    
    void setID(int id);
    
    Libary getLibary();
    
    void register(Libary lib);
}