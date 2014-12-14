import java.util.Arrays;


public class SortArrayImpl {

	String[] newArray = {"One", "Two", "Three", "Four", "Elephant"};
	
	public void sortArraySmallToLarge() 
	{		
		Arrays.sort(newArray, (String s1, String s2) -> (s1.length() - s2.length()));		
	}
	
	public void sortArrayLargeToSmall()
	{
		Arrays.sort(newArray, (String s1, String s2) -> (s2.length() - s1.length()));
	}
	
	public void sortArrayFirstCharacter()
	{
		Arrays.sort(newArray, (String s1, String s2) -> (s1.charAt(0) - s2.charAt(0)));
	}
	
	public void sortArrayEFirst()
	{	
		Arrays.sort(newArray, (String s1, String s2) ->	
		{
			
		});
	}
	
	public static void main(String[] args)
	{
		SortArrayImpl sortScr = new SortArrayImpl();
		sortScr.launch();
	}
	
	public void launch()
	{
		System.out.println("Small to Large Sort");
		System.out.println("Unsorted Array");
		printArray();
		sortArraySmallToLarge();
		System.out.println();
		System.out.println("Sorted Array");
		printArray();
		System.out.println("Largest to Smallest");
		sortArrayLargeToSmall();
		printArray();
		System.out.println();
		System.out.println("First Character");
		sortArrayFirstCharacter();
		printArray();
		System.out.println();
		System.out.println("E First");
		sortArraySmallToLarge();
		sortArrayEFirst();
		printArray();
	}
	
	public void printArray()
	{
		for (int i = 0; i < newArray.length; i++)
		{
			System.out.print(newArray[i] + " ");
		}
	}

}
