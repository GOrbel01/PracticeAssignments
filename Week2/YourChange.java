import java.util.Scanner;
public class YourChange
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("How much was your Total Purchase?");
double totalPurchase = Double.parseDouble(System.console().readLine());

System.out.println("How much did you Pay?");
double payment = Double.parseDouble(System.console().readLine());

double change = payment - totalPurchase;
double changeTemp = change;

int fiftyNote;
int twentyNote;
int tenNote;
int fiveNote;
int fiftyCoin;
int twentyCoin;
int tenCoin;
int fiveCoin;
int twoCoin;
int oneCoint;

while (changeTemp > 0)
{
	if (changeTemp - 50 > 0)
	{
		fiftyNote++;
	}
	if (changeTemp - 20 > 0)
	{
		twentyNote++;		
	}
	if (changeTemp - 10 > 0)
	{
		tenNote++;
	}
	if (changeTemp - 5 > 0)
	{
		fiveNote++;
	}
}
}}

