//wjp to get ascii value of string characters
import java.util.*;
class StringASCIIValue
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String : ");
		String name=sc.nextLine();

		for(int i=0;i<name.length();i++)
		{
			char name2=name.charAt(i);
			int asciiName=name2;   //widening
			System.out.println(name2+" : "+asciiName);
			
		}
	}
}