import java.io.*;

public class CpUpgrade
{
    public static void main(String[] args)
    {       
        if (args[args.length-1].contains("."))
        {
            System.out.println("Last name Must be a Directory");
            System.out.println("Exiting...");
            System.exit(0);
        }
        File dirForCopy = new File(args[args.length-1]);
        dirForCopy.mkdir();
        for (int i = 0; i < args.length-1; i++)
        {
            File fileToCopy = new File(args[i]);
            try {
                File combined = new File(dirForCopy.getCanonicalPath()+ File.separator + args[i]);
                combined.createNewFile();
            }
            catch (IOException ex)
            {
                ex.printStackTrace();
            }
                
            BufferedReader in = null;
            PrintWriter out = null;
            try {
                in = new BufferedReader(new FileReader(args[i]));
                out = new PrintWriter(new File(dirForCopy.getCanonicalPath()+ File.separator + args[i]));
                String line;
                while ((line = in.readLine()) != null)
                {
                    System.out.println("Writing line to file...");
                    out.write(line);
                    out.println();
                }
            }
            catch (FileNotFoundException ex)
            {
                ex.printStackTrace();
                if (!(fileToCopy.exists()))
                {
                    System.out.println("File " + args[i] + "Does Not Exist");
                    System.exit(0);
                }
            }
            catch (IOException ex)
            {
                ex.printStackTrace();
            }
            finally {
                closeReader(in);
                
                out.close();
            }
        }
    }
    
    public static void closeReader(Reader reader)
    {
        try {
            if(reader != null)
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