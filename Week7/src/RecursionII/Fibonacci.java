public class Fibonacci
{
    private static int[] precalculated = null;
    
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        System.out.println(fib(45));
        long elapsedTime = System.currentTimeMillis()-start;
        System.out.println("Slow Fib Done");
        System.out.println("Time Passed " + elapsedTime);
        System.out.println(fibImp(45));
        long startsecond = System.currentTimeMillis();
        long elapsedTimesecond = System.currentTimeMillis() - startsecond;
        System.out.println("Fast Fib Done");
        System.out.println("Time Passed " + elapsedTimesecond);
    }
    
    public static int fib(int n)
    {
        if ((n == 1) || (n == 2))
        {
            return 1;
        }
        else
        {
            int result = fib(n-1) + fib(n-2);
            return result;
        }
    }
    
    public static int fibImp(int n)
    {
        if (precalculated == null)
        {
            initPrecalculatedArray(n);            
        }
        if (precalculated[n-1] != -1)
        {
            return precalculated[n-1];
        }
        else
        {
            int result = fib(n-1) + fib(n-2);
            precalculated[n-1] = result;
            return result;
        }
    }
    
    private static void initPrecalculatedArray(int size)
    {
        precalculated = new int[size];
        for (int i = 0; i < precalculated.length; i++)
        {
            precalculated[i] = -1;
        }
        precalculated[0] = 1;
        precalculated[1] = 1;
    }
}