import java.util.Scanner;
public class BinaryAndDecimal
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("Enter a Binary Number to Convert to Decimal");
String str = System.console().readLine();
System.out.println("Conerted Values is: " + binaryToDecimal(str));

} private static int findPower(int base, int exp) 
{
   int total = 0;
   for (int i = 1; i <= exp; i++)
   {
   	if (exp == 0)
   	{
   		return 1;
   	}
	total = total + (1 * 2);
   }
   System.out.println("Power was " + total);
   return total;
}

 private static int binaryToDecimal(String b)
{
	int binTotal = 0;
	for (int i = b.length()-1; i >= 0; i--)
	{
		int j = b.length()-1 - i;
		System.out.println("I is: " + i);
		System.out.println("J is: " + j);
		char a = b.charAt(i);
		System.out.println("Digit was " + a);
		if (a == '1')
		{
			System.out.println("Here");
			System.out.println("j later " + j);
			int val = findPower(2, j);
			System.out.println("Val Is: " + val);
			binTotal = binTotal + val;
		}	
	}
	return binTotal;
}
//Math.pow(base,exp)
}

