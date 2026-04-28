import java.io.*;

public class TypesOfExceptions {

    public static void main(String[] args) {

        System.out.println("Program Started\n");

        /* ---------------- UNCHECKED EXCEPTIONS ---------------- */

        // 1. Arithmetic Exception
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        }

        // 2. Null Pointer Exception
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e);
        }

        // 3. Array Index Out Of Bounds Exception
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e);
        }

        // 4. Number Format Exception
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e);
        }

        System.out.println("\n----- CHECKED EXCEPTIONS -----");

        // 5. File Not Found Exception (Checked)
        try {
            FileReader fr = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e);
        }

        System.out.println("\nProgram Ended");
    }
}