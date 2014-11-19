public class LibaryImpl implements Libary
{
    private String name;
    private int ID;
    private int maxNumberOfBooks;
    
    public LibaryImpl(String setName)
    {
        name = setName;
    }
    
    public int getMaxBooksPerUser()
    {
        return maxNumberOfBooks;
    }
    
    public void setMaxNumberOfBooks(int newBookCap)
    {
        maxNumberOfBooks = newBookCap;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getID()
    {
        return ID;
    }
}