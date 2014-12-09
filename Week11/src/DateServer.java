import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Squall on 08/12/2014.
 */
public class DateServer extends UnicastRemoteObject implements DateService {

    public DateServer() throws RemoteException
    {

    }

    @Override
    public String echoDate(String s)
    {
        System.out.println("Sent Current Date and Time to Client Asking For: " + s);
        Calendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        return "Time: " + cal.get(Calendar.HOUR_OF_DAY) + "." + cal.get(Calendar.MINUTE) + " Date: " + cal.get(Calendar.DATE)
                + "-" + cal.get(Calendar.MONTH) + "-" + cal.get(Calendar.YEAR);
    }

}
