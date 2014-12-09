import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Squall on 08/12/2014.
 */
public class Client {

    public static void main(String[] args)
    {
        Client cl = new Client();
        cl.serverLink(args[0]);
    }

    public void serverLink(String link)
    {
        try
        {
            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
            EchoService e = (EchoService) reg.lookup("echoDate");
            e.echo(link);
        }
        catch (RemoteException | NotBoundException ex)
        {
            ex.printStackTrace();
        }
    }

}
