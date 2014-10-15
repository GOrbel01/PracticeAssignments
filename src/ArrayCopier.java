public class ArrayCopier
{
	public static void main(String[] args)
	{
		ArrayCopier ac = new ArrayCopier();
		int[] a = {1, 2, 5, 6, 9};
		int[] b = {1, 4, 5, 4};

		int[] c = {7, 5, 3};
		int[] d = {6, 7, 8, 5, 7, 8, 7};

		int[] e = {9, 5, 43, 24, 7};
		int[] f = {8, 2, 55, 4, 67};

		System.out.println("RAndom LEngth TEst " + (c.length) + "other " + (d.length));

		System.out.println("Arrays A and B Before Copy:");
		ac.printArray(a, 'B');
		ac.printArray(b, 'A');
		ac.copy(a, b);
		ac.printArray(a, 'A');
		ac.printArray(b, 'B');
		System.out.println("Arrays C and D Before Copy:");
		ac.printArray(c, 'C');
		ac.printArray(d, 'D');
		ac.copy(c, d);
		ac.printArray(c, 'C');
		ac.printArray(d, 'D');
		System.out.println("Arrays E and F Before Copy:");
		ac.printArray(e, 'E');
		ac.printArray(f, 'F');
		ac.copy(e, f);
		ac.printArray(e, 'E');
		ac.printArray(f, 'F');
	}

	public void copy(int[] src, int[] dst)
	{
		System.out.println("Copying Array...");

		if (src.length < dst.length)
		{
			srcSmallerCopy(src, dst);
		}
		else if (src.length > dst.length)
		{
			srcLargerCopy(src, dst);
		}
		else
		{
			srcLargerCopy(src, dst);
		}
	}

	public void srcLargerCopy(int[] src, int[] dst)
	{
		int i = 0;
		for (i = 0; i < src.length; i++)
		{
			if (dst.length > i)
			{
				dst[i] = src[i];
			}
		}
	}

	public void srcSmallerCopy(int[] src, int[] dst)
	{
		int i = 0;
		int j = 0;
		int length = src.length;

		for (i = 0; i < dst.length; i++)
		{
			if (i < length)
			{
				dst[i] = src[j];
			}
			else
			{
				dst[i] = 0;
			}
			j++;
		}
	}

	public void srcSmallerCopyNotZeros(int[] src, int[] dst)
	{
		int i = 0;
		int j = 0;
		int length = src.length;

		for (i = 0; i < dst.length; i++)
		{
			if (i < length)
			{
				dst[i] = src[j];
				j++;
			}

		}
	}

	public void printArray(int[] a, char c)
	{
		System.out.println("Array " + c + " :");
		for (int i = 0; i < a.length; i++)
		{
			System.out.println("Array Digit " + (i+1) + " :" + a[i]);
		}
	}

}