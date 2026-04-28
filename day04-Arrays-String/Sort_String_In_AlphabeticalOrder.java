//WAJP to sort the string elements and pprint the string based on alphabetical order
import java.util.*;
class Sort_String_In_AlphabeticalOrder
{
	public static void main(String[] args) 
	{

		String str="shivani";
		
		int len=str.length();
		int arr[]=new int[len];

		for(int i=0;i<str.length();i++)
		{
			arr[i]=str.codePointAt(i);
		}	
		System.out.println(Arrays.toString(arr));

			int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}

			}
		}

		System.out.println(Arrays.toString(arr));
		String rev="";
		for(int i=0;i<arr.length;i++)
		{
			rev=rev+(char)arr[i];
		}
		System.out.println(rev);

		


	}
}

