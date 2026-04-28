//CMD compiler coverts Non-Primitive datatype To primitive datatype is known as Autounboxing
import java.util.Arrays;
class CommandLineArgument
{
	public static void main(String[] args) 
	{
		int num1=Integer.parseInt(args[0]); //Autoboxing
		int num2=Integer.parseInt(args[1]);
		System.out.println("Addition :"+(num1+num2));		
	}
}