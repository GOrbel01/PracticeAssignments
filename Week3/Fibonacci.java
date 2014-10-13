import java.util.Scanner;
public class Fibonacci
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println(fibonnaci(3, 0));

} private static int fibonnaci(int n, int m)
{
	m++;
	if (n==1 | n==2)
	{
		return 1;
	}
	else
	{
		int result = fibonnaci(n-1, m) + fibonnaci(n-2, m);
		System.out.println("Method Count: " + m);
		System.out.println(n-1);
		System.out.println(n-2);
		return result;		
	}
}
}

