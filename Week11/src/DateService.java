import sun.util.resources.cldr.aa.CalendarData_aa_ER;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;

/**
 * Created by Squall on 08/12/2014.
 */
public interface DateService extends Remote {

    public String echoDate(String s) throws RemoteException;
}
