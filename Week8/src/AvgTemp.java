import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class AvgTemp
{
    private ArrayList<Double> storedAverageTemps = new ArrayList<Double>();
    public static void main(String[] args)
    {
        AvgTemp avgTempScr = new AvgTemp();
        avgTempScr.launch();
    }
    
    public void launch()
    {
        readAndComputeFile();
        for (int i = 0; i < storedAverageTemps.size(); i++)
        {
            System.out.println("Element " + i + " " + storedAverageTemps.get(i));
        }
    }
    
    public void readAndComputeFile()
    {
        File tempFile = new File("temps.txt");
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(tempFile));
            String line;
            while ((line = in.readLine()) != null)
            {
                splitAndStoreAverage(line);
            }
        }    
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
    
    public void splitAndStoreAverage(String line)
    {
        double result = 0;
        double average = 0;
        String[] splitLine;
        splitLine = line.split(", ");
        for (int i = 0; i < splitLine.length; i++)
        {
            result = result + parseTemp(splitLine[i]);
        }
        average = result/splitLine.length;
        storedAverageTemps.add(average);
    }    
    
    public double parseTemp(String temp)
    {
        double result = 0;
        try {
            result = Double.parseDouble(temp);
        }
        catch (InputMismatchException ex)
        {
            ex.printStackTrace();
        }
        return result;
    }
    
    public void closeReader(Reader reader)
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