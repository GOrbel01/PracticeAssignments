import org.junit.*;
import static org.junit.Assert.*;

public class UserInterfaceExtendedTest
{
    @Test
    public void UserInterfaceETest()
    {
        Libary testLibary = new LibaryImpl("Test Libary");
        User testUser1 = new User("Jake");
        User testUser2 = new User("Emma");
        testUser1.register(testLibary);      
        testUser2.register(testLibary);
        String expectedName = "Test Libary";
        int expectedID = 0;
        assertEquals(testUser1.getID(), expectedID);
        assertEquals(testUser2.getID(), expectedID);
        assertEquals(testUser1.getLibary().getName(), expectedName);
        assertEquals(testUser2.getLibary().getName(), expectedName);
    }
    
    @Test
    public void LibraryTest()
    {
        Libary newLibary = new LibaryImpl("London Royal Libary");
        Libary anotherLibary = new LibaryImpl("Watford Libary");
        String expectedNameFirst = "London Royal Libary";
        String expectedNameSecond = "Watford Libary";
        newLibary.setMaxNumberOfBooks(5);
        anotherLibary.setMaxNumberOfBooks(6);
        
        assertEquals(newLibary.getMaxBooksPerUser(), 5);
        assertEquals(anotherLibary.getMaxBooksPerUser(), 6);
        assertEquals(newLibary.getName(), expectedNameFirst);
        assertEquals(anotherLibary.getName(), expectedNameSecond);                
    }
    ,
}