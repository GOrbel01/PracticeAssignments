import java.util.Scanner;
public class Calculator
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("Enter the First Number.");
String str1 = System.console().readLine();
System.out.println("Enter the Second Number.");
String str2 = System.console().readLine();
double num1 = Double.parseDouble(str1);
double num2 = Double.parseDouble(str2);
boolean hasSelected = false;
double result = 0;

int select = 0;

System.out.println("What operation would you like to perform?");
System.out.println("1 = Addition, 2 = Subtraction, 3 = Multiplication, 4 = Division");

while (!hasSelected)
{
	String selString = System.console().readLine();
	select = Integer.parseInt(selString);
	if (select == 1 || select == 2 || select == 3 || select == 4)
	{
		hasSelected = true;
	}
}
if (select == 1)
{
	result = num1 + num2;
}
else if (select == 2)
{
	result = num1 - num2;
}
else if (select == 3)
{
	result = num1 * num2;
}
else if (select == 4)
{
	result = num1 / num2;
}
System.out.println("Result: " + result);
}}

