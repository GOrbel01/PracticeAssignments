import java.util.Scanner;

/**
 * Created by Squall on 22/10/2014.
 */
public class HashUtilities {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Give me a String and I will calculate its hash code");
        String str = keyboard.nextLine();
        int hash = str.hashCode();

    }

    public int shortHash()
    {

    }

}
