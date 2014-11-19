public class Book implements BookInterface
{
    private String title;
    private String author;
    
    public Book(String setAuthor, String setTitle)
    {
        author = setAuthor;
        title = setTitle;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
}