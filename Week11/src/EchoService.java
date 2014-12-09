import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Squall on 08/12/2014.
 */
public interface EchoService extends Remote {

    public String echo(String s) throws RemoteException;
}
