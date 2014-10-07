import java.util.Scanner;
public class CLCalculator
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
boolean hasSelected = false;
double dOne;
double dTwo;
double result = 0;
char operator;
int i = 0;
int l = 0;

	System.out.println("Enter your Expression");
	System.out.println("In the format, e.g. 24/5");
	String userChoice = System.console().readLine();
	l = userChoice.length();
	if (userChoice.contains("/"))
	{		
		i = userChoice.indexOf("/");
		operator = userChoice.charAt(i);
		dOne = Double.parseDouble(userChoice.substring(0, i-1));
		dTwo = Double.parseDouble(userChoice.substring(i+1, l));
		result = dOne/dTwo;
		System.out.println(dOne + " " + operator + " " + dTwo + " Equals: " + result);
	}
	if (userChoice.contains("+"))
	{
		i = userChoice.indexOf("+");
		operator = userChoice.charAt(i);
		dOne = Double.parseDouble(userChoice.substring(0, i-1));
		dTwo = Double.parseDouble(userChoice.substring(i+1, l));
		result = dOne+dTwo;
		System.out.println(dOne + " " + operator + " " + dTwo + " Equals: " + result);
	}
	if (userChoice.contains("*"))
	{
		i = userChoice.indexOf("+");
		operator = userChoice.charAt(i);
		dOne = Double.parseDouble(userChoice.substring(0, i-1));
		dTwo = Double.parseDouble(userChoice.substring(i+1, l));
		result = dOne*dTwo;
		System.out.println(dOne + " " + operator + " " + dTwo + " Equals: " + result);
	}
	if (userChoice.contains("-"))
	{
		i = userChoice.indexOf("-");
		operator = userChoice.charAt(i);
		dOne = Double.parseDouble(userChoice.substring(0, i-1));
		dTwo = Double.parseDouble(userChoice.substring(i+1, l));
		result = dOne-dTwo;
		System.out.println(dOne + " " + operator + " " + dTwo + " Equals: " + result);
	}
}}

