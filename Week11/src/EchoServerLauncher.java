import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Squall on 08/12/2014.
 */
public class EchoServerLauncher {

    public static void main(String[] args)
    {
        EchoServerLauncher exL = new EchoServerLauncher();
        exL.registerServer();
        System.out.println("Server Running");
    }

    public void registerServer()
    {
        try
        {
            //Create Registry if not exist
            Registry reg = LocateRegistry.createRegistry(1099);
            reg.rebind("echoDate", new EchoServer());
        }
        catch (RemoteException ex)
        {
            ex.printStackTrace();
        }
    }

}
