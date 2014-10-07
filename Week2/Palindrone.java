import java.util.Scanner;
public class Palindrone
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("Enter potential Palindrome");
String str1 = System.console().readLine();

int count = 0;
int j = 0;

for (int i = 0; i < str1.length()-1; i++)
{
	j = (str1.length()-1) - i;
		if (str1.charAt(j) == str1.charAt(i))
		{
			count++;
		}
}
if (count >= str1.length()-1)
{
	System.out.println("It is a Palindrome!");
}
else
{
	System.out.println("Not a Palindrome!");
}
}}

