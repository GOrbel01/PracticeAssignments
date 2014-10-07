import java.util.Scanner;
public class WordOnALine
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("Enter a Sentence");
System.out.println();
String str1 = System.console().readLine();
int spaces = str1.indexOf(" ");
System.out.println(str1.substring(0, spaces));
int next = str1.indexOf(" ", spaces+1);
for (int i = spaces; i < str1.length(); i++)
{		
	String temp = str1.substring(spaces, spaces+1);	
	if (str1.substring(i, i+1).equals(" "))
	{
		System.out.println(temp);
		next = str1.indexOf(" ", spaces+1);
	}
	
}
}}

