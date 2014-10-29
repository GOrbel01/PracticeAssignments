/**
 * Created by Squall on 29/10/2014.
 */
public class PhoneLauncher {

    public static void main(String[] args)
    {
        launch();
    }

    public static void launch()
    {
        SmartPhone galaxyS4 = new SmartPhone("Samsung");

        galaxyS4.call("666");
        galaxyS4.call("999");
        galaxyS4.call("111");
        galaxyS4.call("0542 23415");
        galaxyS4.call("0099 23415");
        galaxyS4.call("0542 23415");
        galaxyS4.call("0542 23415");
        galaxyS4.call("0542 23415");
        galaxyS4.call("0542 23415");
        galaxyS4.call("0542 23415");
        galaxyS4.call("955 64643");

        galaxyS4.printLastNumbers();

        galaxyS4.playGame("GuessTheNumber");

        System.out.println(galaxyS4.findPosition());

        galaxyS4.browseWeb("google");

        galaxyS4.ringAlarm("NOW");
    }
}
