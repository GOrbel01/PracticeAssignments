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
        int shortHash = HashUtilities.shortHash(hash);
        System.out.println("0 < " + shortHash + " < 1000");
    }

    public static int shortHash(int full)
    {
        int shortHash = Math.abs(full);
        do {
            if (full % 2 != 0)
            {
                shortHash = shortHash-1;
            }
            shortHash = shortHash / 2;
        } while (shortHash > 1000);
        System.out.println(shortHash);
        return shortHash;
    }

//    public int shortHash()
//    {
//
//    }

}
