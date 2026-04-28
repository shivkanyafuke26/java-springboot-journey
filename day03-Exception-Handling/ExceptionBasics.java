public class ExceptionBasics {

    public static void main(String[] args) {

        System.out.println("Program Started");

        // 1. Arithmetic Exception (try-catch)
        try {
            int a = 10;
            int b = 0;
            int c = a / b;   // error
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero");
        }

        // 2. Null Pointer Exception
        try {
            String s = null;
            System.out.println(s.length());
        }
        catch (NullPointerException e) {
            System.out.println("Exception caught: Null value accessed");
        }

        // 3. Array Exception
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Invalid array index");
        }

        // finally block
        try {
            int x = 5 / 1;
            System.out.println("Result: " + x);
        }
        catch (Exception e) {
            System.out.println("Error occurred");
        }
        finally {
            System.out.println("Finally block always executes");
        }

        System.out.println("\nProgram Ended");
    }
}