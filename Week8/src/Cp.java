import java.io.*;

public class Cp
{
    public static void main(String[] args)
    {
        if (args.length > 2)
        {
            System.out.println("Too Many Arguments... Ending Program");
            System.exit(0);
        }
        else
        {
            File toCopyFrom = new File(args[0]);
            File toCopyTo = new File(args[1]);
            try {
                toCopyTo.createNewFile();
            }
            catch (IOException ex)
            {
                ex.printStackTrace();
            }
                
            BufferedReader in = null;
            PrintWriter out = null;
            try {
                in = new BufferedReader(new FileReader(toCopyFrom));
                out = new PrintWriter(toCopyTo);
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
                if (!toCopyFrom.exists())
                {
                    System.out.println("File " + toCopyFrom + "Does Not Exist");
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