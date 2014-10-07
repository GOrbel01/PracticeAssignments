import java.util.Scanner;
public class PalindromeCreator
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("Enter potential Palindrome");
String str1 = System.console().readLine();
String str2 = "";
int count = 0;
int j = 0;

System.out.println(str1);

for (int i = 0; i <= str1.length()-1; i++)
{	
	j = (str1.length()-1) - i;	
	String temp = str1.substring(j, j+1);
	str2 = str2 + temp;
}
System.out.println(str2);
}}

