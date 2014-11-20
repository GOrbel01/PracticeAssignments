import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Cat
{
    public static void main(String[] args)
    {
        if (args.length > 1)
        {
            System.out.println("Too Many Arguments... Ending Program");
            System.exit(0);
        }
        else
        {
            File catFile = new File(args[0]);
                BufferedReader in = null;
                try {
                    in = new BufferedReader(new FileReader(catFile));
                    String line;
                    while ((line = in.readLine()) != null)
                    {
                        System.out.println(line);
                    }
                }
                catch (FileNotFoundException ex)
                {
                    System.out.println("File " + catFile + " does not exist");
                }
                catch (IOException ex)
                {
                    ex.printStackTrace();
                }
                finally
                {
                    closeReader(in);
                }
        }
    }
    
    private static void closeReader(Reader reader)
    {
        try 
        {
            if (reader != null)
            {
                reader.close();
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
       
}