/**
 * Created by Squall on 29/10/2014.
 */
public class MobilePhone extends OldPhone implements Phone {

    private String[] phoneNumber = new String[10];
    private int count = 0;

    public MobilePhone(String brand)
    {
        super(brand);
        initiatePhoneHistory();
    }

    @Override
    public void call(String number)
    {
        super.call(number);
        boolean isDone = false;
        while (!isDone)
        {
            if (findEmptySlot() != 10)
            {
                count = findEmptySlot();
            }
            if (!(phoneNumber[count].equals("")))
            {
                if (isDuplicate(number))
                {
                    isDone = true;
                }
            }
            else
            {
                if (isDuplicate(number))
                {
                    isDone = true;
                }
                else
                {
                    phoneNumber[count] = number;
                    count++;
                    isDone = true;
                }
            }
        }
    }

    private int findEmptySlot()
    {
        for (int i = 0; i < phoneNumber.length; i++)
        {
            if (phoneNumber[i].equals(""))
            {
                return i;
            }
        }
        return 10;
    }

    public boolean isDuplicate(String number)
    {
        for (int i = 0; i < phoneNumber.length; i++) {
            if ((phoneNumber[i].equals(number))) {
                return true;
            }
        }
        return false;
    }

    public void ringAlarm(String time)
    {
        if (time.equals("NOW"))
        {
            System.out.println("LOUD NOISES");
        }
    }

    public void playGame(String name)
    {
        switch (name)
        {
            case "GuessTheNumber":
                System.out.println("What is the Number bro!");
        }

    }

    public void printLastNumbers()
    {
        for (int i = 0; i < phoneNumber.length; i++)
        {
            System.out.println("Number " + i + " " + phoneNumber[i]);
        }
    }

    public void initiatePhoneHistory()
    {
        for (int i = 0; i < phoneNumber.length; i++)
        {
            phoneNumber[i] = "";
        }
    }

    @Override
    public String getBrand()
    {
        return this.getBrand();
    }

}
