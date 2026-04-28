import java.util.*;
public class StringToArray{
	public static void main(String[] args) {
	
	String s= "Hello";

	char arr[]=new char[s.length()];

	for(char i=0;i<s.length();i++)
	{
		arr[i]=s.charAt(i);
	}	

	System.out.println(Arrays.toString(arr));

	}
}
