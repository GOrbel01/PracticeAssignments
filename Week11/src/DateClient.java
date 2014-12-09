import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by Squall on 08/12/2014.
 */
public class DateClient {
    public static void main(String[] args)
    {
        DateClient dcl = new DateClient();
        int num1 = dcl.getClientNumbers();
        int num2 = dcl.getClientNumbers();
        String operation = dcl.getOperation();
    }

    public int getClientNumbers()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an Integer to Run an Operation on:");
        int choice = keyboard.nextInt();
        return choice;
    }

    public String getOperation()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an Operation to Run ('/*+-'):");
        String op = keyboard.next();
        return op;
    }

    public void serverLink(String req)
    {
        String foundDate = "";
        try
        {
            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
            DateService dE = (DateService) reg.lookup("echo");
            foundDate = dE.echoDate(req);
        }
        catch (RemoteException | NotBoundException ex)
        {
            ex.printStackTrace();
        }
        System.out.println(foundDate);
    }
}
