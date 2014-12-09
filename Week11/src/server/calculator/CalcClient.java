package server.calculator;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Squall on 08/12/2014.
 */
public class CalcClient {

    public static void main(String[] args)
    {
        CalcClient ccl = new CalcClient();
        ccl.serverLink(args[0]);
    }

    public void serverLink(String req)
    {
        try
        {
            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
            CalculatorService cServ = (CalculatorService) reg.lookup("echo");
        }
        catch (RemoteException | NotBoundException ex)
        {
            ex.printStackTrace();
        }
    }
}
