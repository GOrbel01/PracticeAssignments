public class Matrix
{
	int[][] m;

	public static void main(String[] args)
	{
		Matrix aMat = new Matrix(7, 5);
		aMat.setRow(1, "1,2,3,4,5");
	}

	public Matrix(int la, int lb)
	{
		m = new int[la][lb];
		for (int i = 0; i < m.length; i++)
		{
			for (int j = 0; j < m[0].length; j++)
			{
				m[i][j] = 0;
			}
		}
	}

	public void setElement(int pos1, int pos2, int num)
	{
		m[pos1][pos2] = num;
	}

	public void setRow(int pos, String nums)
	{
		getIntFromString(nums);
		for (int i = 0; i < m[pos].length; i++)
		{

		}
	}

	public int[] getIntArrayFromString(String num)
	{
		int length = num.length()-1;
		int count = 0;
		for (int index = num.indexOf(','); index >= 0; index = num.indexOf(',', index + 1))
		{
			System.out.println(index);
			count++;
		}
		System.out.println("Number of I " + count);
		int[] i = new int[count]; // commaIndex     commaIndex[i]
		int[] numbersFromString = new int[count+1];
		count = 0;
		for (int index = num.indexOf(','); index >= 0; index = num.indexOf(',', index + 1))
		{
			i[count] = index;
			count++;
		}
		for (int j = 0; j < numbersFromString.length; j++)
		{
			if (j == 0)
			{
				numbersFromString[j] = Integer.parseInt(num.substring(0, i[j]));
			}
			else if (j == i.length-1)
			{
				numbersFromString[j] = Integer.parseInt(num.substring(i[j], length));
			}
			else
			{
				numbersFromString[j] = Integer.parseInt(num.substring(i[j], i[j+1]));
			}
		}
		return numbersFromString;

	}

		public void printArray(int[] a)
		{
			for (int i = 0; i < a.length; i++)
			{
				System.out.println("Array Digit " + (i+1) + " :" + a[i]);
			}
		}

}