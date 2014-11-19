import java.io.File;
import java.util.InputMismatchException;

public class MkdirConsole
{
    public static void main(String[] args)
    {
        if (args.length > 1)
        {
            System.out.println("Too many Args... Ending Program");
            System.exit(0);
        }
        else
        {
            String fileName = ".." + File.separator + File.separator + args[0];
            File folderName = new File(fileName);
            folderName.mkdir();
        }
    }
}