import java.util.Scanner;
public class Recursive
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
printNumbers(6);

} private static void printNumbers(int n) 
{
	if (n <= 0) {
		System.out.println("returned");
		return;
	}
	System.out.println(n);
	printNumbers(n-2);
	printNumbers(n-3);
	System.out.println(n);
}
}

