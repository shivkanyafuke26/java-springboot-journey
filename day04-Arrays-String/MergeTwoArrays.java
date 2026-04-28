import java.util.*;
class MergeTwoArrays{
public static void main(String[] args) {
		int arr1[]={1,2,3,4,5};
		int arr2[]={6,7,8,9};

		int a1=arr1.length;
		int a2=arr2.length;

		int newarr[]= new int[a1+a2];

		int t=0;

		for(int i=0;i<a1;i++)
		{
			newarr[i]=arr1[t++];
		}

		int t1=0;
		for(int i=0;i<a2;i++)
		{
			newarr[a1+i]=arr2[t1++];
		}

		System.out.println(Arrays.toString(newarr));
	}	
}