import java.util.Scanner;
public class HowManyLetters
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("Enter a Sentence");
String str1 = System.console().readLine();
int count = 0;

System.out.println("Enter which letter to search for");
String let1 = System.console().readLine();

for (int i = 0; i < str1.length(); i++)
{
	if (str1.substring(i, i+1).equals(let1))
	{
		count++;
	}
}
System.out.println("Total Cases of " + let1 + ": " + count);
}}

