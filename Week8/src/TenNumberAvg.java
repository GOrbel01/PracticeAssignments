import java.util.Scanner;
import java.util.InputMismatchException;

public class TenNumberAvg
{
    public static void main(String[] args)
    {
        TenNumberAvg tNAScr = new TenNumberAvg();
        tNAScr.launch();
    }
    
    public void launch()
    {
        double[] storedUserNumbers = new double[10];
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Please Enter Number " + (i+1));
            storedUserNumbers[i] = getUserInput();
        }
        System.out.println(computedAverage(storedUserNumbers));
    }
    
    public double computedAverage(double[] d)
    {
        double total = 0;
        for (int i = 0; i < d.length; i++)
        {
            total = total + d[i];
        }
        return total/10;
    }
    
    public double getUserInput()
    {
        double numberEntered = 0.0;
        Scanner keyboard = new Scanner(System.in);
        try 
        {            
            numberEntered = keyboard.nextDouble();
        }
        catch(InputMismatchException ex)
        {
            ex.printStackTrace();
            System.out.println("Invaid Number entered");
        }
        return numberEntered;
    }
}