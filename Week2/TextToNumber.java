import java.util.Scanner;
public class TextToNumber
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("Enter a Number");
String str1 = System.console().readLine();

int commaIndex = str1.indexOf(",");
int decimalIndex = str1.indexOf(".");

int part1 = Integer.parseInt(str1.substring(0, commaIndex));
int part2 = Integer.parseInt(str1.substring(commaIndex + 1, decimalIndex));
int part3 = Integer.parseInt(str1.substring(decimalIndex + 1, str1.length())); 

System.out.println(part1);
System.out.println(part2);
System.out.println(part3);

System.out.print((part1/2));
System.out.print((part2/2));
System.out.print(".");
System.out.print((part3/2));
}}

