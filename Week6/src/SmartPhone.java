/**
 * Created by Squall on 29/10/2014.
 */
public class SmartPhone extends MobilePhone implements Phone {

    public SmartPhone(String brand)
    {
        super(brand);
    }

    @Override
    public void call(String number)
    {
        super.call(number);
        if (number.charAt(0) == '0' && number.charAt(1) == '0')
        {
            System.out.println("Calling Using Internet to Save money");
        }
    }

    public void browseWeb(String site)
    {
        if (site.equals("google"))
        {
            System.out.println("What would you like to search");
        }
    }

    public String findPosition()
    {
        return "You are located at 24,41,5. That is cool right?";
    }

}
