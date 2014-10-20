import java.util.Scanner;

/**
 * Created by Squall on 20/10/2014.
 */
public class MarkChecker {

    //[0] = fail, [1] = pass, [2] = dist [3] = invalid
    int[] markTotals = new int[4];

    public static void main(String[] args)
    {
        MarkChecker mc = new MarkChecker();
        mc.launch();
    }

    public void launch()
    {
        Scanner keyboard = new Scanner(System.in);
        int theMark = 0;
        do
        {
            System.out.println("Enter a Test Result of 1-100");
            theMark = keyboard.nextInt();
            checkResult(new Result(theMark));
        }
        while (theMark != -1);

        printResults();

    }

    public void checkResult(Result r)
    {
        if (r.getMark() > 0 && r.getMark() <= 49)
        {
            markTotals[0] = markTotals[0] + 1;
        }
        else if (r.getMark() > 49 && r.getMark() <= 69)
        {
            markTotals[1] = markTotals[1] + 1;
        }
        if (r.getMark() > 69 && r.getMark() <= 100)
        {
            markTotals[2] = markTotals[2] + 1;
        }
        else
        {
            markTotals[3] = markTotals[3]  + 1;
        }
    }

    public void printResults()
    {
        int total = markTotals[0] + markTotals[1] + markTotals[2] + markTotals[3];
        System.out.println("Fails: " + markTotals[0]);
        System.out.println("Passes: " + markTotals[1]);
        System.out.println("Distinctions: " + markTotals[2]);
        System.out.println("Invalid Results: " + markTotals[3]);
        System.out.println("Results Total: " + total);
    }
}
