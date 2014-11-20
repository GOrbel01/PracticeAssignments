import java.util.Scanner;
import java.io.File;
import java.util.InputMismatchException;

public class Mkdir 
{
    public static void main(String[] args)
    {
        Mkdir mkscr = new Mkdir();
        mkscr.launch();
    }
    
    public void launch()
    {
        createFolder();
    }
    
    public void createFolder()
    {
        String dirName = "." + File.separator + chooseFileName();
        File newFolder = new File(dirName);
        newFolder.mkdir();
    }
    
    public String chooseFileName()
    {
        String newFolderName = "";
        Scanner keyboard = new Scanner(System.in);
        boolean isDone = false;
        while (!isDone)
        {
            try 
            {               
                System.out.println("Enter a Folder Name");
                newFolderName = keyboard.next();
                isDone = true;                
            }
            catch (InputMismatchException ex)
            {
                ex.printStackTrace();
                System.out.println("Invalid Folder Name");
            }
        }
        return newFolderName;
    }
}