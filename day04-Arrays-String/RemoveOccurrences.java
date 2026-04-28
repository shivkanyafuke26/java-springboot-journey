import java.util.*;
class RemoveOccurrences
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String input=sc.next();

		System.out.println("Enter the character to remove Occurrences");
		String ch=sc.next();

		String modified=input.replace(ch,"");
		
		System.out.println(modified);

	}
}



// import java.util.*;
// class RemoveOccurrences
// {
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter the string : ");
// 		String input=sc.next();

// 		System.out.println("Enter the character to remove Occurrences");
// 		String ch=sc.next();

// 		String modified=input.replace(ch,"");
		
// 		System.out.println(modified);

// 	}
// }

//wajp to get the count of repeated characters in a given string
//WAJP to check if the string is palindrome
//WAJP to get the count of vowels and consonants in a given string and also store the vowels and consonants in a separate strings
// Java Program to Remove Duplicate Elements
// From the Array using extra space
