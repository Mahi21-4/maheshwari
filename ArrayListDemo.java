import java.util.*;
public class ArrayListDemo
{
	public static void main(String args[])
	{
		String arr[]={"dog","cat","elephant"};
		for(String value : arr)
		{
			System.out.println(value);
		}
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);
	}
}
