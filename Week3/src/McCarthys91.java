import java.util.Scanner;
public class McCarthys91
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println(mcCarthy91(95, 1));

} private static int mcCarthy91(int n, int m)
{
	if (n > 100)
	{
		System.out.println(n + " - 10 Returned");
		return n-10;
	}
	else
	{
		System.out.println("M Number: " + m);
		System.out.println(n);
		m++;
		return mcCarthy91(mcCarthy91(n+11, m), m);
	}	
}
}

