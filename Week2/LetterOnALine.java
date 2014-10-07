import java.util.Scanner;
public class LetterOnALine
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("Enter a Sentence");
System.out.println();
String str1 = System.console().readLine();

for (int i = 0; i < str1.length(); i++)
{
	String temp = str1.substring(i, i+1);
	System.out.println(temp);
}
}}

