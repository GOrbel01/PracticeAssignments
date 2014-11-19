import org.junit.*;
import static org.junit.Assert.*;

public class UserInterfaceTest
{
    @Test
    public void testUser()
    {
        String expectedName1 = "Iain";
        String expectedName2 = "Gemma";        
        int expectedID1 = 1045;
        int expectedID2 = 2456;
        
        User firstUser = new User("Iain");
        User secondUser = new User("Gemma");
        firstUser.setID(1045);
        secondUser.setID(2456);
        assertEquals(firstUser.getName(), expectedName1);
        assertEquals(secondUser.getName(), expectedName2);
        assertEquals(firstUser.getID(), expectedID1);
        assertEquals(secondUser.getID(), expectedID2);
    }    
    
}