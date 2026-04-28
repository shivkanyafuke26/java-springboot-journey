import java.util.*;
class ArraySumProd
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size=sc.nextInt();
		System.out.println("Enter Array Elements : ");
		int []arr=new int[size];

		int sum=0;
		int prod=1;

		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			prod=prod*arr[i];
		}
		System.out.println("SUM : "+sum);
		System.out.println("PRODUCT : "+prod);
	}

}