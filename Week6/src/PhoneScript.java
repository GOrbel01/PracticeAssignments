/**
 * Created by Squall on 03/11/2014.
 */
public class PhoneScript {
    public static void main(String[] args)
    {
        PhoneScript pscr = new PhoneScript();
        pscr.launch();
    }

    public void launch()
    {
//        SmartPhone myPhone = new SmartPhone("Samsung");

        MobilePhone myPhone = new MobilePhone("Samsung");
//        myPhone.browseWeb("google");
        myPhone.call("077 3555");
//        myPhone.findPosition();
        myPhone.playGame("GuessTheNumber");
        testPhone(myPhone);
    }

    public void testPhone(Phone phone)
    {
        SmartPhone newPhone;
        newPhone = (SmartPhone) phone;
        newPhone.browseWeb("google");
    }


}
