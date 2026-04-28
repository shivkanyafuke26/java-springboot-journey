import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class AllInputMethods {
    public static void main(String[] args) throws Exception {

        // 1. Scanner Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number using Scanner: ");
        int num1 = sc.nextInt();
        System.out.println("Scanner Input: " + num1);

        sc.nextLine(); // clear buffer

        // 2. BufferedReader Input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter name using BufferedReader: ");
        String name = br.readLine();
        System.out.println("BufferedReader Input: " + name);

        // 3. Console Input
        Console con = System.console();
        if (con != null) {
            String city = con.readLine("Enter city using Console: ");
            System.out.println("Console Input: " + city);
        } else {
            System.out.println("Console not supported in IDE.");
        }

        // 4. Command Line Arguments
        if (args.length > 0) {
            System.out.println("Command Line Argument Input: " + args[0]);
        } else {
            System.out.println("No Command Line Arguments Passed.");
        }

        // 5. DataInputStream Input
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter text using DataInputStream: ");
        String text = dis.readLine();
        System.out.println("DataInputStream Input: " + text);

        // 6. File Input
        File file = new File("input.txt");
        if (file.exists()) {
            Scanner fileSc = new Scanner(file);
            System.out.println("File Input:");
            while (fileSc.hasNextLine()) {
                System.out.println(fileSc.nextLine());
            }
            fileSc.close();
        } else {
            System.out.println("input.txt file not found.");
        }

        // 7. JOptionPane GUI Input
        String msg = JOptionPane.showInputDialog("Enter message using JOptionPane:");
        System.out.println("JOptionPane Input: " + msg);

        sc.close();
    }
}