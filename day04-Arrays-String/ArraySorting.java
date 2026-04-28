import java.util.*;	
public class ArraySorting
{
	public static void main(String[] args) {
		int arr[] ={1,6,2,5,3,4};

		for(int i=0;i<arr.length;i++)
		{
			int temp=0;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}