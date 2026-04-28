public class TryCatchFinallyDemo {

    public static void main(String[] args) {

        System.out.println("Program Started\n");

        try {
            System.out.println("Inside try block");

            int a = 10;
            int b = 0;

            int result = a / b;   // Exception occurs here

            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Catch block: Exception handled -> Cannot divide by zero");
        }

        finally {
            System.out.println("Finally block: Always executes");
        }

        System.out.println("\nProgram Ended");
    }
}