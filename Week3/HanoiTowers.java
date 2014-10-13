import java.util.Scanner;
public class HanoiTowers
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("How many Discs?");
double n = Double.parseDouble(System.console().readLine());
System.out.println(playHanoi(n));

} private static double playHanoi(double n)
{
	if (n == 1)
	{
		return 1;
	}
	double result = playHanoi(n-1) + 1 + playHanoi(n-1);
	System.out.println(result);
	return result;
}
}

