import java.io.*;
import java.lang.*;
import java.util.*;
public class ArraysDemo{
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		int size=5;
		int arr[]={1,2,3,4,5};

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		//taking input from user
		System.out.println("Enter size of Array : ");
		int s=sc.nextInt();
		int arrn[]=new int[s];

		for(int i=0;i<s;i++)
		{
			arrn[i]=sc.nextInt();
		}
		System.out.println(java.util.Arrays.toString(arrn));

	}
}