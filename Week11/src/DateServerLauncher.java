import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Squall on 08/12/2014.
 */
public class DateServerLauncher {

    public static void main(String[] args)
    {
        DateServerLauncher dxL = new DateServerLauncher();
        dxL.registerServer();
        System.out.println("Server Running");
    }

    public void registerServer()
    {
        try
        {
            //Create Registry if not exist
            Registry reg = LocateRegistry.createRegistry(1099);
            reg.rebind("echo", new DateServer());
        }
        catch (RemoteException ex)
        {
            ex.printStackTrace();
        }
    }
}
