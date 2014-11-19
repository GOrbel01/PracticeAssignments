import org.junit.*;
import static org.junit.Assert.*;

public class JUnitTest
{
    
    public static void main(String[] args)
    {
        JUnitTest testsrc = new JUnitTest();
        testsrc.testNormalName();
    }
    
    public String getInitials(String fullName)
    {
        String result = "";
        String[] words = fullName.split(" ");
        for (int i = 0; i < fullName.length(); i++)
        {
            String nextInitial = "" + words[i].charAt(0);
            result = result + nextInitial.toUpperCase();
        }
        return result;
    }
    
    @Test
    public void testNormalName()
    {
        String input = "Dereck Robert Yssirt";
        String output = getInitials(input);
        String expected = "DRY";
        assertEquals(output, expected);        
    }
}