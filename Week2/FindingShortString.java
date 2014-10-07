import java.util.Scanner;
public class FindingShortString
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("Enter a Short Sentence to search for");
String shortString = System.console().readLine();

System.out.println("Now enter the sentence to search through");
String longString = System.console().readLine();

int count = 0;
int matchCount = 0;

for (int i = 0; i < longString.length()-1; i++)
{
	count = 0;
	for (int j = 0; j < shortString.length()-1; j++)
	{		
		int temp = i + j;
		if (longString.charAt(temp) == shortString.charAt(j))
		{
			count++;
		}		
	}
	if (count >= shortString.length()-1)
	{
		matchCount++;
	}
}
System.out.println("The short sentence occured " + matchCount + " times.");
}}

